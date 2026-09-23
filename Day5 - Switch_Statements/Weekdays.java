import java.util.*;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("It's a Weekday, Go to work ");
                break;
            case 6 :
            case 7 :
                System.out.println("It's Weekend, Go and enjoy ");
                break;
            default :
                System.out.println("Enter a valid input ");
        }
    }
}
