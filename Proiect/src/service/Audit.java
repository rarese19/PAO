package service;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Audit {
    private static Audit instance = null;
    private static FileWriter writer;
    private static String path = "audit.csv";
    private static int count = 0;
    private Audit() {
        try {
            writer = new FileWriter(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Audit getInstance() {
        if (instance == null) {
            instance = new Audit();
        }
        return instance;
    }

    public <T> void write(String action, T entity) {
        try {
            writer.write(action + entity.getClass().getSimpleName());
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String time = now.format(formatter);
            writer.write(", " + time + "\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
