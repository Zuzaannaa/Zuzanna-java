package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isPainted;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean isPainted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isPainted = isPainted;
    }

    @Override
    public String executeTask() {
        isPainted = true;
        return "Painting: " + whatToPaint + " Color: " + color;
    }

    @Override
    public String taskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(isPainted){
            return true;
        }else{
            return false;
        }
    }
}
