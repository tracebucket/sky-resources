package com.leanthoughts.sky.resources.dictionary.jpa.impl;

import com.leanthoughts.sky.resources.dictionary.Phone;
import com.leanthoughts.sky.resources.dictionary.PhoneType;
import com.leanthoughts.sky.resources.dictionary.converter.PhoneTypeConverter;

import javax.persistence.*;

@Embeddable
public class DefaultPhone extends BaseValueObject implements Phone {

    @Column(name = "NUMBER")
    @Basic(fetch = FetchType.EAGER)
    private String number;

    @Column(name = "EXTENSION")
    @Basic(fetch = FetchType.EAGER)
    private String extension;

    @Column(name = "PHONE_TYPE")
    @Convert(converter = PhoneTypeConverter.class)
    private PhoneType phoneType;

    @Column(name = "DEFAULT_PHONE", nullable = false, columnDefinition = "boolean default true")
    @Basic(fetch = FetchType.EAGER)
    private boolean defaultPhone;

    public DefaultPhone(){

    }

    @Override
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public boolean isDefaultPhone() {
        return defaultPhone;
    }

    public void setDefaultPhone(boolean defaultPhone) {
        this.defaultPhone = defaultPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DefaultPhone)) return false;

        DefaultPhone phone = (DefaultPhone) o;

        if (extension != null ? !extension.equals(phone.extension) : phone.extension != null) return false;
        if (!number.equals(phone.number)) return false;
        if (phoneType != phone.phoneType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number.hashCode();
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + (phoneType != null ? phoneType.hashCode() : 0);
        return result;
    }
}
