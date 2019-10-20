package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");

        Country poland = new Country(new BigDecimal(12345678), "Poland");
        Country germany = new Country(new BigDecimal(98765432), "Germany");

        Country sudan = new Country(new BigDecimal(12345678), "Sudan");
        Country egypt = new Country(new BigDecimal(98765432), "Egypt");

        world.addContinent(europe);
        world.addContinent(africa);

        europe.addCountry(poland);
        europe.addCountry(germany);

        africa.addCountry(sudan);
        africa.addCountry(egypt);

        //When
        BigDecimal allPeople = world.getPeopleQuantity();
        //Then
        BigDecimal all = new BigDecimal(222222220);
        Assert.assertEquals(all, allPeople);

    }
}
