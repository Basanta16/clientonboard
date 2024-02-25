package com.client.autodatabasecreation.databasemanager;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
@RequiredArgsConstructor
public class DatabaseManager {


    private final DataSource dataSource;

    public void createDatabaseForClient(String clientName) throws SQLException {
        try ( Connection connection1 = dataSource.getConnection()) {
            String databaseName = clientName + "_db";
            String sql = "CREATE DATABASE " + databaseName;
            try (PreparedStatement statement = connection1.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        }
    }
}
