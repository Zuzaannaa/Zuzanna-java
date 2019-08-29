package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final Country country;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String continentName, Country country){
        this.continentName = continentName;
        this.country = country;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Country getCountry() {
        return country;
    }
}
