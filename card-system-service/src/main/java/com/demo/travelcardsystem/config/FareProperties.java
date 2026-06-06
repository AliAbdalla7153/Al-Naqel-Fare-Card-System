package com.demo.travelcardsystem.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "fare")
public class FareProperties {
    private double max;
    private double zoneOne;
    private double zoneOutsideOne;
    private double twoZonesIncludingOne;
    private double twoZonesExcludingOne;
    private double threeZones;
    private double bus;
}