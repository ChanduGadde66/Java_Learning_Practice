import java.util.*;

public class Multiple_Methods {
    static int calculateTotal(int m1, int m2, int m3) {
        return m1+m2+m3;
    }
    static double calculateAverage(int m1, int m2, int m3) {
        return calculateTotal(m1,m2,m3) / 3;
    }
    static void displayResult(int m1,int m2, int m3) {
        System.out.println("The total : " + calculateTotal(m1,m2,m3));
        System.out.println("Average is : " + calculateAverage(m1,m2,m3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        displayResult(m1,m2,m3);
    }
}
