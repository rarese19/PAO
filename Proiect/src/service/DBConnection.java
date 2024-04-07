package service;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "utilizator";
    private static final String PASSWORD = "parola";

    private static Connection conn;
    private static DBConnection instance;

    private DBConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        DBConnection.conn = conn;
    }

    public static void setInstance(DBConnection instance) {
        DBConnection.instance = instance;
    }
}
