package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator.*;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ArrayList<Integer> empty = new ArrayList<>();
        //When
        ArrayList<Integer> result1 = ext.exterminate(empty);
        //Then
        Assert.assertEquals(empty.size(), result1.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ArrayList<Integer> exterminated = new ArrayList<>();
        ArrayList<Integer> all = new ArrayList<>();
        for (int n = 0; n < 10; n++) {
            all.add(n);
        }
        ArrayList<Integer> odd = new ArrayList<>();
        for (int n = 0; n < 10; n += 2) {
            odd.add(n);
        }
        //When
        exterminated = ext.exterminate(all);
        //Then
        Assert.assertTrue(odd.equals(exterminated));

    }

}
