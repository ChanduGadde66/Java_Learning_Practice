import java.util.*;

public class Decision_Making_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int age = sc.nextInt();
       if(age>12 && age < 20) {
           System.out.println("You are a Teenager");
       }
       else {
           System.out.println("You are not a teenager");
       }
    }
}
