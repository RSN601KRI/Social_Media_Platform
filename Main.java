
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            SocialMediaPlatform socialMediaPlatform = new SocialMediaPlatform();

            // Menu
            while (true) {
                System.out.println("\nMini Social Media Platform Menu:");
                System.out.println("1. Create a user");
                System.out.println("2. Post a message");
                System.out.println("3. Display user timeline");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        socialMediaPlatform.addUser(username);
                        System.out.println("User created successfully.");
                        break;

                    case 2:
                        System.out.print("Enter username to post message: ");
                        String postUsername = scanner.nextLine();
                        System.out.print("Enter message content: ");
                        String content = scanner.nextLine();
                        socialMediaPlatform.postMessage(postUsername, content);
                        break;

                    case 3:
                        System.out.print("Enter username to display timeline: ");
                        String timelineUsername = scanner.nextLine();
                        socialMediaPlatform.displayTimeline(timelineUsername);
                        break;

                    case 4:
                        System.out.println("Exiting the Mini Social Media Platform. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }
}
