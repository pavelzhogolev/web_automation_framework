package com.sample.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Account {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String dateOfBirth;

    private Address address;
}
