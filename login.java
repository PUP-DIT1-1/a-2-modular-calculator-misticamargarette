import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class login {
    private static final int MAX_ATTEMPTS = 3;
    private static final Map<String, String> USERS = new LinkedHashMap<>();

    static {
        USERS.put("admin", "admin123");
        USERS.put("user", "user123");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Login System");
            System.out.println("---------------------------");

            String username = authenticate(scanner);
            if (username == null) {
                System.out.println("Too many failed attempts. Access denied.");
                return;
            }

            showMenu(scanner, username);
        }
    }

    private static String authenticate(Scanner scanner) {
        for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
            System.out.print("Username: ");
            String username = scanner.nextLine().trim();

            System.out.print("Password: ");
            String password = scanner.nextLine().trim();

            if (isValidLogin(username, password)) {
                System.out.println("Login successful.");
                return username;
            }

            int remaining = MAX_ATTEMPTS - attempt;
            if (remaining > 0) {
                System.out.println("Invalid username or password. Attempts left: " + remaining);
            }
        }

        return null;
    }

    private static boolean isValidLogin(String username, String password) {
        return USERS.containsKey(username) && USERS.get(username).equals(password);
    }

    private static void showMenu(Scanner scanner, String username) {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("Welcome, " + username + "!");
            System.out.println("1. View profile");
            System.out.println("2. View available features");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Profile");
                    System.out.println("Username: " + username);
                    System.out.println("Role: " + ("admin".equals(username) ? "Administrator" : "Standard User"));
                    break;
                case "2":
                    System.out.println("Available features");
                    System.out.println("- Secure login");
                    System.out.println("- Profile viewing");
                    System.out.println("- Menu navigation");
                    break;
                case "3":
                    System.out.println("Logged out successfully.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }
    }
}
