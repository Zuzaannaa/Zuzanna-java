package com.kodilla.patterns.factory.tasks;

public interface Task {
    String executeTask();

    String taskName();

    boolean isTaskExecuted();
}
