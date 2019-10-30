package com.kodilla.patterns.singleton;

public enum Log {
    LOGIN;
    private String lastLog = "";

    public String getLastLog() {
        return lastLog;
    }

    public void setLastLog(String lastLog) {
        this.lastLog = lastLog;
    }

}
