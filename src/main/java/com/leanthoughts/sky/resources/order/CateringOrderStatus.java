package com.leanthoughts.sky.resources.order;

public class CateringOrderStatus {

    private String name;
    private String abbreviation;

    public CateringOrderStatus() {}

    public CateringOrderStatus(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}