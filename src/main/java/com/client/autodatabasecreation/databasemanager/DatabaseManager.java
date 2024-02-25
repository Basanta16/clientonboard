package com.client.autodatabasecreation.databasemanager;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class DatabaseManager {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/masterdb";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "postgres";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void createDatabaseForClient(String clientName) throws SQLException {
        try (Connection connection = getConnection()) {
            String databaseName = clientName + "_db";
            String sql = "CREATE DATABASE " + databaseName;
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        }
    }
}
