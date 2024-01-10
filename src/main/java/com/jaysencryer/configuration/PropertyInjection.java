package com.jaysencryer.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "my-properties")
@Getter
@Setter
@Component
public class PropertyInjection {
    String stringProperty;
    Integer numberProperty;
    List<String> listOfStrings;
    CustomDataClass dataClass;
    List<CustomDataClass> listOfDataClasses;
}
