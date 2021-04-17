import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import command.operation.Command;

public class Start {
    private String username;
    private String password;
    private Scanner scanner;

    public Start() {
        this.scanner = new Scanner(System.in);
        welcome();
    }

    public void welcome() {
        Command.clearScreen();
        System.out.print("Welcom to school management system.\n" +
                         "Please enter the account and password or enter 'exit' to exit.\n" +
                         "Accout: ");
        username = scanner.nextLine();
        checkInput(username);
        System.out.print("Password: ");
        password = scanner.nextLine();
        checkPassword(password);
    }

    public void checkInput (String input) {
        if (input.equals("exit")) {
            Command.exit();
        }
    }

    public void checkPassword(String password) {
        while (!"password".equals(password)) {
            checkInput(password);
            System.out.print("Password error. Please enter again.\nPassword: ");
            password = scanner.nextLine();
        }
        this.password = password;
        Command.clearScreen();
        System.out.println("Success Login! Welcome, " + this.getCurrentUser() + "!");
    }

    public String getCurrentUser() {
        return this.username;
    }
}
