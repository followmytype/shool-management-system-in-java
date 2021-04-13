import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    private String username;
    private String password;
    private Scanner scanner;

    public Start() {
        this.scanner = new Scanner(System.in);
        welcome();
    }

    public void welcome() {
        clearScreen();
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
            exit();
        }
    }

    public void checkPassword(String password) {
        while (!"password".equals(password)) {
            checkInput(password);
            System.out.print("Password error. Please enter again.\nPassword: ");
            password = scanner.nextLine();
        }
        this.password = password;
        clearScreen();
        System.out.println("Success Login! Welcome, " + this.getCurrentUser() + "!");
    }

    public static void exit() {
        System.out.println("Bye~");
        System.exit(0);
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public String getCurrentUser() {
        return this.username;
    }
}
