import java.util.*;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd number");
        }
    }
}
