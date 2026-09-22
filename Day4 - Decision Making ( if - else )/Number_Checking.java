import java.util.*;

public class Number_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0) {
            System.out.println("Positive Number ");
        }
        else if(n<0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
