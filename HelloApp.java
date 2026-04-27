/**
 * UC4 – Display Hello with Multiple Command-Line Arguments
 */
public class HelloApp {

    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            String joinedNames = String.join(", ", args);
            message = "Hello, " + joinedNames + "!";
        } else {
            message = "Hello, World!";
        }

        System.out.println(message);
    }
}