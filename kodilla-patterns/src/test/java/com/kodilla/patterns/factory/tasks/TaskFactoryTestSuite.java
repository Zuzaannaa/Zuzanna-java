package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Driving to: Safeway Using: Honda", drivingTask.executeTask());
        Assert.assertEquals("Shopping", drivingTask.taskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting: Flowers Color: Red", paintingTask.executeTask());
        Assert.assertEquals("Painting Class", paintingTask.taskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Buying: Pumpkin Quantity: 5.0", shoppingTask.executeTask());
        Assert.assertEquals("Halloween Shopping", shoppingTask.taskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

}
