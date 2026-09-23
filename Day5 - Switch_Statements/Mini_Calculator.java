import java.util.*;

public class Mini_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Value : " );
        int a = sc.nextInt();
        System.out.print("Enter 2nd Value : ");
        int b = sc.nextInt();
        System.out.print("Enter operator : ");
        char op = sc.next().charAt(0);
        switch(op) {
            case '+' :
                int sum = a + b;
                System.out.println("Sum : " +sum);
                break;
            case '-' :
                int diff = a - b;
                System.out.println("Difference : " +diff);
                break;
            case '*' :
                int mul = a*b;
                System.out.println("Multiplication : " +mul);
                break;
            case '/' :
                int div = a/b;
                System.out.println("Division : " +div);
                break;
            default :
                System.out.println("Enter a valid operator ");
        }
    }
}
