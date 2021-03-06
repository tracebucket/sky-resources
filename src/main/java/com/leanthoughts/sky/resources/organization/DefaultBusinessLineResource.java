package com.leanthoughts.sky.resources.organization;


import com.leanthoughts.sky.resources.BaseResource;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by sadath on 31-Mar-15.
 */
public class DefaultBusinessLineResource extends BaseResource {

    @NotNull
    @Size(min = 1, max = 250)
    @Pattern(regexp = "^[A-Za-z ]*$")
    private String name;

    @Size(min = 1, max = 255)
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}