package view;

import java.util.Scanner;

public class ConsoleApp {
    private static ConsoleApp instance = null;


    private ConsoleApp() {}

    public static ConsoleApp getInstance() {
        if (instance == null) {
            instance = new ConsoleApp();
        }
        return instance;
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("-------Welcome to WSS-------");
            System.out.println("1. Admin Mode");
            System.out.println("2. Manager Mode");
            System.out.println("3. Casierie");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    AdminMode adminMode = AdminMode.getInstance();
                    adminMode.run();
                    break;
                case 2:
                    ManagerMode managerMode = ManagerMode.getInstance();
                    managerMode.run();
                    break;
                case 3:
                    CasierieMode casierieMode = CasierieMode.getInstance();
                    casierieMode.run();
                    break;
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
