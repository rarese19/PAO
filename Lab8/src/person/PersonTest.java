package person;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    private static final String SEPARATOR = ",";

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Person eu = new Person("Papusoi", "Rares", 20, "rares@mail.com");
        Person mihai = new Person("Dogaru", "Mihail", 20, "mihail@mail.com");
        persons.add(eu);
        persons.add(mihai);
        writeUsingPrintWriter(persons);

    }

    private static void writeUsingPrintWriter(ArrayList<Person> dataLines) {
        try (PrintWriter pw = new PrintWriter(new File("csv_PrintWriter_output.csv"))) {
            for (Person line : dataLines) {
                String csvLine = transformToCSV(line);
                pw.println(csvLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String transformToCSV(Person data) {
        StringBuilder csvRow = new StringBuilder();
//        for (String element : data) {
//            csvRow.append(element).append(SEPARATOR);
//        }
        csvRow.append(data.getNume()).append(SEPARATOR);
        csvRow.append(data.getPrenume()).append(SEPARATOR);
        csvRow.append(data.getVarsta()).append(SEPARATOR);
        csvRow.append(data.getEmail()).append(SEPARATOR);
        csvRow.deleteCharAt(csvRow.length() -1);
        return csvRow.toString();
    }
}
