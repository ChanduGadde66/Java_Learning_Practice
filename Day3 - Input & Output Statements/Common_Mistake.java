import java.util.*;

public class Common_Mistake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer value and immediate any string value : ");
      /*  int a = sc.nextInt();
        String s1 = sc.nextLine();
        System.out.println("The value of integer is : " + a + " The value stored in string is : " + s1);

        Enter any integer value and immediate any string value :
        Input :   3
        The value of integer is : 3 The value stored in string is :

         Why output comes like this why it is unable to enter string value?
         The correct format is below */

        int a = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();

        System.out.println("The value of integer is : " + a + ", The value stored in string is : " + s1 + " ");
        sc.close();
    }
}
