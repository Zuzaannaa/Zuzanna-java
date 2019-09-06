package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(1, 21)
                .limit(numbers.length)
                .forEach(System.out::println);
         double result = IntStream.range(1, 21)
                .limit(numbers.length)
                .average().getAsDouble();


         return result;

    }
}
