package com.leanthoughts.sky.resources.dictionary.converter;

import com.leanthoughts.sky.resources.dictionary.PersonType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 23-Nov-2015.
 */
@Converter(autoApply = true)
public class PersonTypeConverter implements AttributeConverter<PersonType, String> {
    @Override
    public String convertToDatabaseColumn(PersonType personType) {
        switch (personType) {
            case TECHNICAL:
                return "TECHNICAL";
            case ADMINISTRATIVE:
                return "ADMINISTRATIVE";
            default:
                throw new IllegalArgumentException("Unknown value: " + personType);
        }
    }

    @Override
    public PersonType convertToEntityAttribute(String s) {
        switch (s) {
            case "TECHNICAL":
                return PersonType.TECHNICAL;
            case "ADMINISTRATIVE":
                return PersonType.ADMINISTRATIVE;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}
