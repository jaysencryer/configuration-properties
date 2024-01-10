package com.jaysencryer.springrest.configrationproperties;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigurationPropertiesController {
    private final PropertyInjection propertyInjection;
    private final YamlInjection yamlInjection;

    @GetMapping("properties")
    public PropertyInjection getProperties() {
        return propertyInjection;
    }

    @GetMapping("custom-yaml")
    public YamlInjection getYamlProperties() {
        return yamlInjection;
    }
}
