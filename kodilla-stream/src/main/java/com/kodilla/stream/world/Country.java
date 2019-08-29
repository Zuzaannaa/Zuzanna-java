package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;
    private final List<Country> countries = new ArrayList<>();

    public Country(BigDecimal peopleQuantity, String countryName){
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return countryName.equals(country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                ", countries=" + countries +
                '}';
    }
}
