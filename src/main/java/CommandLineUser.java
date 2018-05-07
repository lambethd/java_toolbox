import java.util.Scanner;

public class CommandLineUser {

    private static Scanner sc;

    public CommandLineUser() {
        sc = new Scanner(System.in);
    }

    public String getLine() {
        return sc.nextLine();
    }

    public void close() {
        sc.close();
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }
}
