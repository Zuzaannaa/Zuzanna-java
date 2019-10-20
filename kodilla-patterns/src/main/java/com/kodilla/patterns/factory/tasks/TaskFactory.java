package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Shopping", "Safeway", "Honda", true);
            case PAINTINGTASK:
                return new PaintingTask("Painting Class", "Red", "Flowers", true);
            case SHOPPINGTASK:
                return new ShoppingTask("Halloween Shopping", "Pumpkin", 5, true);
            default:
                return null;
        }
    }
}
