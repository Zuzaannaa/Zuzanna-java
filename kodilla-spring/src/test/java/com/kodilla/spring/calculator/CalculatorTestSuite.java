package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(4, 5);
        double subResult = calculator.sub(10, 5);
        double mulResult = calculator.mul(9, 3);
        double divResult = calculator.div(81, 9);
        //Then
        Assert.assertEquals(9, addResult, 0.1);
        Assert.assertEquals(5, subResult, 0.1);
        Assert.assertEquals(27, mulResult, 0.1);
        Assert.assertEquals(9, divResult, 0.1);
    }
}
