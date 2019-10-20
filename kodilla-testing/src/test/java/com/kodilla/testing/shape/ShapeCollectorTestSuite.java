package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Triangle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.ShapeCollector;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 2, 4);
        //When
        collector.addFigure(triangle);
        //Then
        Assert.assertNotNull(collector);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 2, 4);
        collector.addFigure(triangle);
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //When
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 2, 4);
        collector.addFigure(triangle);
        //Given
        String figure = collector.getFigure(0);
        //Then
        Assert.assertEquals("triangle", figure);
    }

    @Test
    public void testShowFigure() {
        //When
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle", 2, 4);
        ArrayList<Shape> figures = new ArrayList<>();
        figures.add(triangle);
        //Given
        collector.addFigure(triangle);
        ArrayList<Shape> all = collector.showFigure();
        String figure = collector.getFigure(0);
        //Then
        Assert.assertEquals("triangle", figure);
    }

}
