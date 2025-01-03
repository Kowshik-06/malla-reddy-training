import java.util.Scanner;

public class logincheck {
    public static void main(String[] args) {
        String username = "user";  // Predefined username
        String password = "pass";  // Predefined password

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Wishing you a happy new year");
        } else {
            System.out.println("Login Failed!");
        }

        scanner.close();
    }
}
