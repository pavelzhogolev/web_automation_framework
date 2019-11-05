package com.sample.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Address {

    private String company;

    private String address;

    private String addressLine2;

    private String city;

    private String state;

    private String postalCode;

    private String additionalInformation;

    private String homePhone;

    private String mobilePhone;

    private String alias;
}
