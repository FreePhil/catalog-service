package com.example.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "polar")
public class PolarProperties {
    private String greeting;
    private ArcticProperties arctic;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public ArcticProperties getArctic() {
        return arctic;
    }

    public void setArctic(ArcticProperties arctic) {
        this.arctic = arctic;
    }
}
