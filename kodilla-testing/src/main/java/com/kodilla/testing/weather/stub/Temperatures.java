package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {
    //first element = station number
    //second element = temperature in Celsius
    HashMap<Integer, Double> getTemperatures();
}
