import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, "+name+"\n"+"You were born in "+yearOfBirth);
    }
}
