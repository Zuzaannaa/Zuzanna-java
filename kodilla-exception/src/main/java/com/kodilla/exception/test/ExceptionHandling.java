package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            SecondChallenge secondChallenge = new SecondChallenge();
            secondChallenge.probablyIWillThrowException(2, 1);
        }catch(Exception e){
            System.out.println("NO" + e);
        }finally{
            System.out.println("Done");
        }
    }

}
