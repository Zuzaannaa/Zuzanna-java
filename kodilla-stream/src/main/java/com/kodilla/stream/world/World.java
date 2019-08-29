package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final Continent continent;
    private final List<Continent> continents = new ArrayList<>();

    public World(Continent continent) {
        this.continent = continent;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continent.getCountry().getPeopleQuantity();

    }

    public Continent getContinent() {
        return continent;
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
