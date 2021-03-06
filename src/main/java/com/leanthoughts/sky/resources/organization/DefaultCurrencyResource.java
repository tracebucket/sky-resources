package com.leanthoughts.sky.resources.organization;

import com.leanthoughts.sky.resources.BaseResource;
import com.leanthoughts.sky.resources.dictionary.CurrencyType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by sadath on 16-Apr-15.
 */
public class DefaultCurrencyResource extends BaseResource {

    @NotNull
    @Size(min = 1, max = 250)
    @Pattern(regexp = "^[A-Za-z ]*$")
    private String name;

    @Size(min = 1, max = 200)
    @Pattern(regexp = "^[A-Za-z]*$")
    private String iso4217Code;

    @Size(min = 1, max = 200)
    @Pattern(regexp = "^[A-Za-z]*$")
    private String subUnit110;

    @Size(min = 1, max = 250)
    @Pattern(regexp = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)")
    private String image;


    private CurrencyType currencyType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso4217Code() {
        return iso4217Code;
    }

    public void setIso4217Code(String iso4217Code) {
        this.iso4217Code = iso4217Code;
    }

    public String getSubUnit110() {
        return subUnit110;
    }

    public void setSubUnit110(String subUnit110) {
        this.subUnit110 = subUnit110;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }
}
