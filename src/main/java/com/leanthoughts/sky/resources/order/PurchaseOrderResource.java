package com.leanthoughts.sky.resources.order;

import java.time.LocalDate;
import java.util.List;

/**
 * @author fahad
 * @since 10-05-2016.
 */
public class PurchaseOrderResource extends BaseOrderResource {

    private String purchaseOrderUid;
    private static final String type = "PurchaseOrder";
    private String orderingPartyReference;
    private String recepientPartyReference;
    private String contactPersonReference;
    private List<String> referenceOrder;
    private LocalDate deliveryDate;
    private String deliveryAddress;
    private String status;
    private String subType;
    private String planningGroup;

    /** Customized Properties For App**/
    private String orderingParty;
    private String recepientParty;
    private String contactPerson;

    public PurchaseOrderResource() {
    }

    public String getPurchaseOrderUid() {
        return purchaseOrderUid;
    }

    public void setPurchaseOrderUid(String purchaseOrderUid) {
        this.purchaseOrderUid = purchaseOrderUid;
    }

    public static String getType() {
        return type;
    }

    public String getOrderingPartyReference() {
        return orderingPartyReference;
    }

    public void setOrderingPartyReference(String orderingPartyReference) {
        this.orderingPartyReference = orderingPartyReference;
    }

    public String getRecepientPartyReference() {
        return recepientPartyReference;
    }

    public void setRecepientPartyReference(String recepientPartyReference) {
        this.recepientPartyReference = recepientPartyReference;
    }

    public String getContactPersonReference() {
        return contactPersonReference;
    }

    public void setContactPersonReference(String contactPersonReference) {
        this.contactPersonReference = contactPersonReference;
    }

    public List<String> getReferenceOrder() {
        return referenceOrder;
    }

    public void setReferenceOrder(List<String> referenceOrder) {
        this.referenceOrder = referenceOrder;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getPlanningGroup() {
        return planningGroup;
    }

    public void setPlanningGroup(String planningGroup) {
        this.planningGroup = planningGroup;
    }

    public String getOrderingParty() {
        return orderingParty;
    }

    public void setOrderingParty(String orderingParty) {
        this.orderingParty = orderingParty;
    }

    public String getRecepientParty() {
        return recepientParty;
    }

    public void setRecepientParty(String recepientParty) {
        this.recepientParty = recepientParty;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
