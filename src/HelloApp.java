public class HelloApp {
    public static void main (String [] args)
    
    {
        System.out.println("Hello App Welcomed ");
    public static void main(String[] args) {
        String name = "World";
        if (args.length > 0) {
            name = args[0];
        }
        // Get the name from command-line argument
        String name = args.length > 0 ? args[0] : "Sai Ganesh";

        // Print greeting message
        System.out.println("Hello, " + name + "!");
    }
}
