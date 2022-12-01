public class Main {
    public static void main(String[] args) {
        String user = "Jane";
        String date = "Wed Nov 30 22:10:10 EST 2022";
        String greeting = "Hello, %s! It is %s.";
        String goodbye = "Goodbye, %s.";

        greeting = String.format(greeting, user, date);
        goodbye = String.format(goodbye, user);

        System.out.println(greeting);
        System.out.println(goodbye);
    }
}
