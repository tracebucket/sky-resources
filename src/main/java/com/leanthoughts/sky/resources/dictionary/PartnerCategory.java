package com.leanthoughts.sky.resources.dictionary;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by ffl on 26-05-2014.
 */
@JsonFormat(shape = JsonFormat.Shape.SCALAR)
public enum PartnerCategory {
    INDIVIDUAL("Individual", "INDIVIDUAL"),
    GROUP("Group", "GROUP"),
    ORGANIZATION("OrganizationResource", "ORGANIZATION");

    private final String categoryName;
    private final String abbreviation;

    PartnerCategory(String categoryName, String abbreviation){
        this.categoryName = categoryName;
        this.abbreviation = abbreviation;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
