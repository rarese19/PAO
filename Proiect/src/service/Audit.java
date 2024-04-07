package service;

import java.io.FileWriter;
import java.io.IOException;

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

    public void write(String sqlStatement, String result) {
        try {
            writer.write("Statement " + count++ + "\n");
            writer.write(sqlStatement + "\n" + result + "\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
