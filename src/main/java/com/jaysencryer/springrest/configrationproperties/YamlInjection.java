package com.jaysencryer.springrest.configrationproperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = "classpath:custom.yaml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties()
@Getter
@Setter
@Component
public class YamlInjection {
    String yamlPropertyString;
    Integer yamlPropertyNumber;
}
