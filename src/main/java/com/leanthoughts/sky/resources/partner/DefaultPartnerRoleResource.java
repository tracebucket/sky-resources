package com.leanthoughts.sky.resources.partner;

import com.leanthoughts.sky.resources.BaseResource;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 26-May-2015.
 */
public class DefaultPartnerRoleResource extends BaseResource {
    @Size(min = 1, max = 250)
    @Pattern(regexp = "^[a-zA-Z \\-/@]*$")
    private String name;

    @Valid
    private Set<DefaultAddressResource> addresses = new HashSet<DefaultAddressResource>(0);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DefaultAddressResource> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<DefaultAddressResource> addresses) {
        this.addresses = addresses;
    }
}