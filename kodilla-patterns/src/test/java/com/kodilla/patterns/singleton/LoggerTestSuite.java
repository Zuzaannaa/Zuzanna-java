package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void login(){
        logger = new Logger();
        logger.log("You are logged in");
    }

    @Test
    public void testLog(){
        //Given
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assert.assertEquals("You are logged in", lastLog);

    }
}
