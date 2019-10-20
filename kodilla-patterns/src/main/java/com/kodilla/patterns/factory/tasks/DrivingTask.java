package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private final boolean done;

    public DrivingTask(String taskName, String where, String using, boolean done) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.done = done;
    }

    @Override
    public String executeTask() {
        return "Driving to: " + where + " Using: " + using;
    }

    @Override
    public String taskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(done){
            return true;
        }else{
            return false;
        }
    }
}
