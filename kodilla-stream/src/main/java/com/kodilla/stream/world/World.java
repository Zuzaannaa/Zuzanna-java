package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class World {
    private final List<Continent> continents = new ArrayList<>();


    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal people = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,country)->sum.add(country));
        return people;

    }


    public List<Continent> getContinents() {
        return continents;
    }
}
