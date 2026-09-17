import java.util.*;

public class Student_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Hello " + s1 + ", Enter your age : ");
        int age = sc.nextInt();
        System.out.println("As per your age " + age  + " Your profile has been updated in academics");
        System.out.println("Enter the three subjects you like : ");
        sc.nextLine();
        String sub1 = sc.next();
        String sub2 = sc.next();
        String sub3 = sc.next();
        System.out.println("Now enter marks for three subjects respectively  that you got in current year : " );
        int marks1 = sc.nextInt();
        System.out.println("Marks for " + sub1 + " is : " + marks1);
        int marks2 = sc.nextInt();
        System.out.println("Marks for " + sub2 + " is : " + marks2);
        int marks3 = sc.nextInt();
        System.out.println("Marks for " + sub3 + " is : " + marks3);

           sc.close();
    }
}
