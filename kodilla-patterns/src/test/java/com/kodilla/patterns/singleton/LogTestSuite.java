package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogTestSuite {
    @Test
    public void testLog(){
        //Given
        Log log = Log.LOGIN;
        //When
        log.setLastLog("You are logged in");
        //Then
        Assert.assertEquals("You are logged in", log.getLastLog());
    }
}
