package com.leanthoughts.sky.resources.dictionary.converter;

import com.leanthoughts.sky.resources.dictionary.EmailType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by sadath on 23-Nov-2015.
 */
@Converter(autoApply = true)
public class EmailTypeConverter implements AttributeConverter<EmailType, String> {
    @Override
    public String convertToDatabaseColumn(EmailType emailType) {
        switch (emailType) {
            case PERSONAL:
                return "PERSONAL";
            case BUSINESS:
                return "BUSINESS";
            default:
                throw new IllegalArgumentException("Unknown value: " + emailType);
        }
    }

    @Override
    public EmailType convertToEntityAttribute(String s) {
        switch (s) {
            case "PERSONAL":
                return EmailType.PERSONAL;
            case "BUSINESS":
                return EmailType.BUSINESS;
            default:
                throw new IllegalArgumentException("Unknown value: " + s);
        }
    }
}
