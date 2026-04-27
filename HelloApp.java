/**
 * UC6 – Display Hello using substring to remove trailing delimiter
 */
public class HelloApp {

    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                message = "Hello, " + names + "!";
            } else {
                message = "Hello, World!";
            }
        }

        System.out.println(message);
    }
}