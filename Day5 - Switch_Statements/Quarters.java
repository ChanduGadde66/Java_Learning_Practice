import java.util.*;

public class Quarters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter choice : ");
        ch = sc.nextInt();
        switch(ch) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("Quarter 1 ");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("Quarter 2 ");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("Quarter 3 ");
                break;
            case 10 :
            case 11 :
            case 12 :
                System.out.println("Quarter 4 ");
                break;
            default :
                System.out.println("Enter in range 1 - 12 only....");
        }
    }
}
