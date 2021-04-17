package command.operation;

public class Command{
    public static void exit() {
        System.out.println("Bye~");
        System.exit(0);
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
