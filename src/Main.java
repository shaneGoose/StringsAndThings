import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String user = "Jane";
        Date date = new Date();
        String greeting = "Hello, %s! It is %s.";
        String goodbye = "Goodbye, %s.";

        // When in place of a String, an object will automatically invoke its toString() method.
        // "date" is automatically invoking its toString() method
        greeting = String.format(greeting, user, date);
        goodbye = String.format(goodbye, user);

        System.out.println(greeting);
        System.out.println(goodbye);
    }
}
