package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private final boolean isTaskDone;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean isTaskDone) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isTaskDone = isTaskDone;
    }

    @Override
    public String executeTask() {
        return "Buying: " + whatToBuy + " Quantity: " + quantity;
    }

    @Override
    public String taskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(isTaskDone){
            return true;
        }else {
            return false;
        }
    }
}
