package com.tawfeek.creational.singleton.enumimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * why use Enums for singleton
 * Thread Safety: Enum instances are created only once when the enum is loaded, guaranteed by JVM
 * Serialization Safety: The JVM handles serialization of enums properly
 * Reflection Safety: Enums cannot be instantiated via reflection
 * Simple and concise much less code than other singleton implementation
 * Enum vs synchronized blocks:
 * over traditional singleton implementation this implementation don't need synchronized blocks or
 * serialization & deserialization creating multiple instances protected against reflection attacks
 * simplest and most readable
 */


public enum DatabaseConnection {
    INSTANCE;

    private Connection connection;

    private DatabaseConnection() {
        // Initialize your connection here
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void executeQuery(String query) {
        // Execute query using the connection
    }
}