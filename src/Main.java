public class Main {
    public static void main(String[] args) {
        String user = "Jane";
        String date = "Wed Nov 30 22:10:10 EST 2022";
        String greeting = "Hello, (user)! It is (date placeholder).";
        String goodbye = "Goodbye, (user).";

        System.out.println(greeting.replace("(user)", user).replace("(date placeholder)", date));
        System.out.println(goodbye.replace("(user)", user));
    }
}
