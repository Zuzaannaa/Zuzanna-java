package com.kodilla.testing.shape;

public class Square implements Shape {
    public String square = "square";
    public double a = 2;

    public Square(String square, double a) {
        this.square = square;
        this.a = a;
    }

    public String getSquare() {
        return square;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return square;
    }

    @Override
    public double getField() {
        return a * a;
    }
}
