package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continents = new ArrayList<>();


    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        //petla ktora przechodzi przez liste kontynentow + suma
        //petla w petli

    }


    public List<Continent> getContinents() {
        return continents;
    }
}
