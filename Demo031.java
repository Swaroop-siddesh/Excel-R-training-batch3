import java.util.HashSet;
import java.util.Scanner;

public class Demo031 {
    public static void main(String[] args) {
      
        HashSet<Object> dataSet = new HashSet<>();

    
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        dataSet.add(name);

       
        System.out.print("Enter an age: ");
        int age = scanner.nextInt();
        dataSet.add(age);

     
        System.out.println("Data in the HashSet: " + dataSet);
        scanner.close();
    }
}