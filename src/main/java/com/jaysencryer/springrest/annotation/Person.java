package com.jaysencryer.springrest.annotation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Locale;

@JsonSerializable
@Getter
@Setter
@Builder
public class Person {

    @JsonElement
    private String firstName;

    @JsonElement
    private String lastName;

    @JsonElement(key = "personAge")
    private String age;

    private String address;

    @Init
    private void initNames() {
        firstName = firstName.substring(0,1).toUpperCase() +
                firstName.substring(1);

        lastName = lastName.substring(0,1).toUpperCase() +
                lastName.substring(1);
    }

}
