import java.util.*;

public class Grade_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks >= 95) {
            System.out.println("A+ grade");
        }
        else if(marks >= 80) {
            System.out.println("A grade");
        }
        else if(marks >= 65) {
            System.out.println("B grade");
        }
        else if(marks >= 50) {
            System.out.println("C grade");
        } else if (marks >= 35 ) {
            System.out.println("D grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
