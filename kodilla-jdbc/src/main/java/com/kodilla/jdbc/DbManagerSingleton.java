package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManagerSingleton {
    MANAGER;
    private Connection conn;

    DbManagerSingleton() {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_user");
        connectionProps.put("password", "kodilla_password");
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False",
                    connectionProps);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbManagerSingleton getInstance() {
        return MANAGER;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
