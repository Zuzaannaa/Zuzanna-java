package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Objects;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        Triangle triangle = new Triangle("triangle", 2, 4);
        shapes.add(triangle);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public String getFigure(int n){
        Triangle triangle = new Triangle("triangle", 2 , 4);
        shapes.add(triangle);
        String name = triangle.getShapeName();
        return name;
    }
    public ArrayList<Shape> showFigure(){
        Triangle triangle = new Triangle("triangle", 2 , 4);
        ArrayList<Shape> figures = new ArrayList<>();
        figures.add(triangle);
        return figures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShapeCollector that = (ShapeCollector) o;
        return shapes.equals(that.shapes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapes);
    }
}
