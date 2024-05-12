package view;

import persistence.*;
import service.ManagerServices;
import java.util.Scanner;

public class ManagerMode {
    private static ManagerMode instance = null;
    private ManagerServices managerServices = ManagerServices.getInstance();

    private ManagerMode() {}

    public static ManagerMode getInstance() {
        if (instance == null) {
            instance = new ManagerMode();
        }
        return instance;
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = 0;
            System.out.println("-------Manager Mode-------");
            System.out.println("1. Detalii Tranzactii");
            System.out.println("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    managerServices.getDetaliiTranzactii();
            }
        }
    }


}
