package com.jaysencryer.springrest.annotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ObjectToJsonConverterTest {
    @Test
    void convertToJson_withValidObject_ReturnsJsonString() {
        Person person = Person.builder()
                .firstName("mika")
                .lastName("hakkinen")
                .age("55")
                .build();

        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        assertEquals("{\"personAge\":\"55\",\"firstName\":\"Mika\",\"lastName\":\"Hakkinen\"}", jsonString);

    }
}
