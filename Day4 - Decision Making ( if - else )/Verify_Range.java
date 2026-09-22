/* Based on Decision_Making_1.java on repo */

import java.util.*;
public class Verify_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 13 && age <= 19) {        // it is as same as if(age > 12 && age < 20 ) // it is inclusive
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are not a teenager");
        }
    }
}
