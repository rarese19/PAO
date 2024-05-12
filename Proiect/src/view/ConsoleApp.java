package view;

import java.util.Scanner;

public class ConsoleApp {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("-------Welcome to WSS-------");
            System.out.println("1. Admin Mode");
            System.out.println("2. Manager Mode");
            do {
                System.out.print("Choose option: ");
                choice = scanner.nextInt();
                scanner.nextLine();
            } while (choice < 1 || choice > 2);

            switch (choice) {
                case 1:
                    AdminMode adminMode = AdminMode.getInstance();
                    adminMode.run();
                    break;
                case 2:
                    ManagerMode managerMode = ManagerMode.getInstance();
                    managerMode.run();
                    break;
                default:
                    break;
            }
        }
    }
}
