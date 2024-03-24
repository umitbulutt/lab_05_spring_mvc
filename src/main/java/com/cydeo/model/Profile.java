package com.cydeo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Profile {

    private String name;
    private String surname;
    private String userName;
    private String email;
    private String phoneNumber;
    private LocalDateTime createdDate;
}
