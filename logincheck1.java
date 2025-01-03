import java.util.Scanner;

public class logincheck1 {
    public static void main(String[] args) {
        String username = "kowshik";  // Predefined username
        String password = "kowshik_719";  // Predefined password

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Welcome Kowshik");
        } else {
            System.out.println("Login Failed!");
        }

        scanner.close();
    }
}
