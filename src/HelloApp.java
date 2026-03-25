public class HelloApp {
    public static void main(String[] args) {
        // Get the name from command-line argument
        String name = args.length > 0 ? args[0] : "Pranav";

        // Print greeting message
        System.out.println("Hello, " + name + "!");
    }
}
