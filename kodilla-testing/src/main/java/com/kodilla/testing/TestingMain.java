package com.kodilla.testing;
import com.kodilla.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Testing");
        Calculator calculator = new Calculator(10, 7);
        int addResult = calculator.add(10, 7);
        int subtractResult = calculator.subtract(10, 7);

            //add test
        if (addResult == 17) {
            System.out.println("ADD: OK");
        } else {
            System.out.println("Error");
        }

        //subtract test
        if(subtractResult == 3){
            System.out.println("SUBTRACT: OK");
        }else{
            System.out.println("Error");
        }

    }
}
