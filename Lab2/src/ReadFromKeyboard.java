import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class User {
    private String username;
    private int sold;

    public User(String username, int sold) {
        this.username = username;
        this.sold = sold;
    }

    public String getUsername() {
        return username;
    }

    public int getSold() {
        return sold;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}

public class ReadFromKeyboard {

    private static HashMap<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.print("-----------\n");
            System.out.print("Enter command >>>>> ");

            Scanner input = new Scanner(System.in);
            String command = input.next();
            System.out.printf("Command received: %s\n", command);

            if (Objects.equals(command, "help")) {
                System.out.println(
                        "\tAccepted commands:\n" +
                                "\t\thelp: Instructions on how to use the application\n" +
                                "\t\tupdate: Update data. Can receive two parameters: username and sold.\n" +
                                "\t\tdelete: Delete the user's data.  Receive the username.\n" +
                                "\t\tquit: Close the application.\n" +
                                "\t\tgetUser: Get info on user.\n" +
                                "\t\tgetUsers: Get info on all users.\n");
            }

            if (Objects.equals(command, "quit")) {
                System.out.println("Closing application...");
                System.exit(0);
            }

            if (Objects.equals(command, "create")) {
                System.out.print("Username: >>> ");
                String username = input.next();
                System.out.print("Sold: >>> ");
                int sold = Integer.parseInt(input.next());
                users.put(username, new User(username, sold));
                System.out.printf("User %s with sold %d was created!\n", username, sold);
            }

            if (Objects.equals(command, "update")) {
                System.out.print("Username: >>> ");
                String username = input.next();
                System.out.print("Sold: >>> ");
                int sold = Integer.parseInt(input.next());
                User user = users.get(username);
                user.setSold(sold);
                System.out.printf("The sold was update for user %s %d\n", username, sold);
            }

            if (Objects.equals(command, "getUser")) {
                System.out.print("Username: >>> ");
                String username = input.next();
                User user = users.get(username);
                System.out.printf("User %s has sold %d\n", user.getUsername(), user.getSold());
            }

            if (Objects.equals(command, "getUsers")) {
                for (Map.Entry<String, User> set :
                        users.entrySet()) {
                    System.out.printf("User %s with sold %d\n", set.getValue().getUsername(), set.getValue().getSold());
                }
            }

            if (Objects.equals(command, "delete")) {
                System.out.print("Username: >>> ");
                String username = input.next();
                users.remove(username);
                System.out.printf("User %s was delete successfully!\n", username);
            }
        }
    }
}
