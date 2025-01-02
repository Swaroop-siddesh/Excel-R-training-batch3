import java.util.Scanner;

class Demo5 {
    public static void main(String[] args) {
        String loginUsername = "swaroop";
        String loginPassword = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(loginUsername) && inputPassword.equals(loginPassword)) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Password is invalid");
        }

        scanner.close();
    }
}
