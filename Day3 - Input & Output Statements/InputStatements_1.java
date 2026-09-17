import java.util.*;

public class InputStatements_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();

        int sum = a+b;
        int difference = a-b;
        int multiplication = a*b;
        double division = a/b;
        int modulus = a%b;

        System.out.println("The sum of two numbers is : " + sum);
        System.out.println("The difference of two numbers is : " + difference);
        System.out.println("The multiplication of two numbers is : " + multiplication);
        System.out.println("The division of two numbers is : " + division);
        System.out.println("The modular division is : " + modulus);
    }
}
