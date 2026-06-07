package com.demo.travelcardsystem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Al-Naqel Fare Card Management System API")
                        .version("1.0.0")
                        .description("Production Support & Maintenance API documentation for UAE Smart Travel Limited's transit system. " +
                                "Manages automated fare calculations across zones, entry/exit tap validations, and card balances.")
                        .contact(new Contact()
                                .name("UAE Smart Travel Dev Team")));
    }
}