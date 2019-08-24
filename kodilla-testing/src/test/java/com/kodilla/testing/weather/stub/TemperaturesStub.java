package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();
        //dummy data
        stubResult.put(0, 25.1);
        stubResult.put(1, 20.8);
        stubResult.put(2, 27.9);
        stubResult.put(3, 15.6);
        stubResult.put(4, 10.1);

        return stubResult;
    }
}
