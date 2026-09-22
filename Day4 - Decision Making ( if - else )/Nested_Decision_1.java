import java.util.*;

public class Nested_Decision_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your age : " );
        int age = sc.nextInt();
        System.out.println();
        System.out.println("Enter your registration status (true/false) : ");
        boolean registered_status = sc.nextBoolean();
        System.out.println("Enter your payment status (true/false) : ");
        boolean payment_status = sc.nextBoolean();
        if(age>=18) {
            if (registered_status) {
                if (payment_status) {
                    System.out.println("Competition Begins..... ");
                } else {
                    System.out.println("Complete your payment ");
                }
            } else {
                System.out.println("Complete your registration ");
            }
        }
        else{
                    System.out.println("Your age is not eligible ");
                }


    }
}
