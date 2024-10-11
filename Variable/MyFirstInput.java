package Variable;
import java.io.Console;;

public class MyFirstInput {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Enter your name: ");
        String name = console.readLine();

        System.out.println("Your name: "+name);
    }
}
