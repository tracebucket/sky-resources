package com.leanthoughts.sky.resources.partner;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.dictionary.PartnerCategory;

import javax.validation.Valid;

/**
 * Created by sadath on 26-May-2015.
 */
public class DefaultPartnerResource extends BaseResource {

/*    @NotNull
    @Size(min = 1, max = 150)
    @Pattern(regexp = "^[A-Za-z]*$")*/
    private String title;

/*    @Size(min = 1, max = 250)
    @Pattern(regexp = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)")*/
    private String image;

/*    @Size(min = 1, max = 255)
    @URL*/
    private String website;

    private PartnerCategory partnerCategory;

    private DefaultOwnerResource owner;

    @Valid
    private DefaultAffiliateResource affiliate;

    @Valid
    private DefaultCustomerResource customer;

    @Valid
    private DefaultEntertainmentCompanyResource entertainmentCompany;


    private DefaultMuseumResource museum;


    private DefaultTourCompanyResource tourCompany;


    private DefaultTransportProviderResource transportProvider;

    @Valid
    private DefaultEmployeeResource employee;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public PartnerCategory getPartnerCategory() {
        return partnerCategory;
    }

    public void setPartnerCategory(PartnerCategory partnerCategory) {
        this.partnerCategory = partnerCategory;
    }

    public DefaultOwnerResource getOwner() {
        return owner;
    }

    public void setOwner(DefaultOwnerResource owner) {
        this.owner = owner;
    }

    public DefaultAffiliateResource getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(DefaultAffiliateResource affiliate) {
        this.affiliate = affiliate;
    }

    public DefaultCustomerResource getCustomer() {
        return customer;
    }

    public void setCustomer(DefaultCustomerResource customer) {
        this.customer = customer;
    }

    public DefaultEntertainmentCompanyResource getEntertainmentCompany() {
        return entertainmentCompany;
    }

    public void setEntertainmentCompany(DefaultEntertainmentCompanyResource entertainmentCompany) {
        this.entertainmentCompany = entertainmentCompany;
    }

    public DefaultMuseumResource getMuseum() {
        return museum;
    }

    public void setMuseum(DefaultMuseumResource museum) {
        this.museum = museum;
    }

    public DefaultTourCompanyResource getTourCompany() {
        return tourCompany;
    }

    public void setTourCompany(DefaultTourCompanyResource tourCompany) {
        this.tourCompany = tourCompany;
    }

    public DefaultTransportProviderResource getTransportProvider() {
        return transportProvider;
    }

    public void setTransportProvider(DefaultTransportProviderResource transportProvider) {
        this.transportProvider = transportProvider;
    }

    public DefaultEmployeeResource getEmployee() {
        return employee;
    }

    public void setEmployee(DefaultEmployeeResource employee) {
        this.employee = employee;
    }
}