package com.example.HNG_Stage_1.model;

import lombok.Data;

@Data
public class Visitor {
    private String clientIp;
    private String location;
    private String greeting;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
