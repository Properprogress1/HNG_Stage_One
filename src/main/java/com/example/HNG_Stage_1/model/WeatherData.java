package com.example.HNG_Stage_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
    private String locationName;
    private double temperatureC;

    public double getTemperatureC() {
        return temperatureC;
    }
}
