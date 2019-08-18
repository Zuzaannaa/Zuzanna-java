package com.kodilla.testing.shape;

public class Circle implements Shape{
    public String circle = "circle";
    public double r = 3;
    public double pi = 3.14;

    public Circle(String circle, double r, double pi){
        this.circle = circle;
        this.r = r;
        this.pi = pi;
    }
    public String getCircle(){
        return circle;
    }
    public double getR(){
        return r;
    }
    public double getPi(){
        return pi;
    }

    @Override
    public String getShapeName() {
        return circle;
    }

    @Override
    public double getField() {
        return pi * (r * r);
    }
}
