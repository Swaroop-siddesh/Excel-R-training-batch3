import java.util.Scanner;
class demo6 {
    public static void main (String[] args) {
        String loginname =("swaroop");
        String loginpasswords = ("12345");

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR name: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();
        while((loginname=="swaroop")&&(loginpasswords=="12345")){
        System.out.println("Hello; you have logined ");
        scanner.close();
        break;
        }
    }

}