package com.javatechie.config;

import com.javatechie.client.UserClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(basePackages = "com.javatechie.client", types = {UserClient.class})
public class HttpClientsConfig {
    // Spring will scan and create a HTTP client proxy for ProductClient.
}