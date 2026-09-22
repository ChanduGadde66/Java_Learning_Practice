//it is condition based without nested as discussed in Nested_Decision_1.java

import java.util.*;

public class Nested_vs_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your age : " );
        int age = sc.nextInt();

        System.out.println("Enter your registration status (true/false) : ");
        boolean registered_status = sc.nextBoolean();
        System.out.println("Enter your payment status (true/false) : ");
        boolean payment_status = sc.nextBoolean();
        if(age>=18 && registered_status && payment_status ) {
            System.out.println("Competition Begins..... ");
        }
        else{
            System.out.println("Check requirements before entering into competition18");
        }
    }
}
