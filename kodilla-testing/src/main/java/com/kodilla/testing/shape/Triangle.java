package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String triangle = "triangle";
    public double a = 2;
    public double h = 4;

    public Triangle(String triangle, double a, double h) {
        this.triangle = triangle;
        this.a = a;
        this.h = h;
    }

    public String getTriangle() {
        return this.triangle;
    }

    public double getA() {
        return this.a;
    }

    public double getH() {
        return this.h;
    }

    @Override
    public String getShapeName() {
        return triangle;
    }

    @Override
    public double getField() {
        return (a * h) / 2;
    }
}
