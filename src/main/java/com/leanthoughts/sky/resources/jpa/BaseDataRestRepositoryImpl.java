package com.leanthoughts.sky.resources.jpa;

import com.leanthoughts.sky.resources.dictionary.jpa.impl.BaseEntity;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import java.io.Serializable;
import java.util.List;

/**
 * Created by sadath on 03-Feb-2016.
 */
public class BaseDataRestRepositoryImpl<T extends BaseEntity, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseDataRestRepository<T, ID> {

    private EntityManager entityManager;

    private JpaEntityInformation<T, ?> entityInformation;

    public BaseDataRestRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
        this.entityInformation = entityInformation;
    }

    public BaseDataRestRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
    }

    @Override
    @Transactional
    public void delete(ID id) {
        Assert.notNull(id, "The given id must not be null!");
        T entity = findOne(id);
        if(entity != null) {
            entity.setPassive(true);
            save(entity);
        }
    }

    @Override
    @Transactional
    public void delete(T entity) {
        Assert.notNull(entity, "The entity must not be null!");
        entity = entityManager.contains(entity) ? entity : entityManager.merge(entity);
        if(entity != null) {
            entity.setPassive(true);
            save(entity);
        }
    }

    @Override
    public T findOne(ID id) {
        T aggregate = entityManager.find(entityInformation.getJavaType(), id, LockModeType.OPTIMISTIC);
        if (aggregate != null && aggregate.isPassive())
            return null;
        return aggregate;
    }

    @Override
    public List<T> findAll() {
        //return super.findAll();
        return entityManager.createQuery("Select a from " + entityInformation.getEntityName() + " a where a.passive = false")
                .getResultList();
    }

    @Transactional
    @Override
    public <S extends T> S save(S aggregate) {
        if (entityManager.contains(aggregate)){
            //locking Aggregate Root logically protects whole aggregate
            entityManager.lock(aggregate, LockModeType.OPTIMISTIC_FORCE_INCREMENT);
        }
        else{
            entityManager.persist(aggregate);
        }
        return aggregate;
    }

    /**
     * Delete Based On Tenant Id
     * @param id  primary key
     * @param tenantId  tenantId
     * @return void
     */
    @Override
    public void delete(ID id, String tenantId) {
        List<T> result = null;
        if(tenantId != null) {
            result = entityManager.createQuery("Select a from " + entityInformation.getEntityName() + " a where a.tenant.uid = '" + tenantId + "' and a.uid = '" + id + "'")
                    .getResultList();
        } else {
            result = entityManager.createQuery("Select a from " + entityInformation.getEntityName() + " a where a.uid = '" + id + "'")
                    .getResultList();
        }
        if(result != null && result.size() == 1) {
            T entity = result.get(0);
            if(entity != null) {
                entity.setPassive(true);
                save(entity);
            }
        }
    }

    /**
     * Find Based On Tenant Id
     * @param id  primary key
     * @param tenantId  tenantId
     * @return found entity instance
     */
    @Override
    public T findOne(ID id, String tenantId) {
        List<T> result = null;
        if(tenantId != null) {
            result = entityManager.createQuery("Select a from " + entityInformation.getEntityName() + " a where a.tenant.uid = '" + tenantId + "' and a.uid = '" + id + "' and a.passive = false")
                    .getResultList();
        } else {
            result = entityManager.createQuery("Select a from " + entityInformation.getEntityName() + " a where a.uid = '" + id + "' and a.passive = false")
                    .getResultList();
        }
        if(result != null && result.size() == 1) {
            return result.get(0);
        }
        return null;
    }

    /**
     * Find All Based On Tenant Id
     * @param tenantId  tenantId
     * @return list of all found entity instances
     */
    @Override
    public List<T> findAll(String tenantId) {
        if(tenantId != null) {
            return entityManager.createQuery("Select a from " + entityInformation.getEntityName() + " a where a.tenant.uid = '" + tenantId + "' and a.passive = false")
                    .getResultList();
        } else {
            return entityManager.createQuery("Select a from " + entityInformation.getEntityName() + " a where a.passive = false")
                    .getResultList();
        }
    }

}