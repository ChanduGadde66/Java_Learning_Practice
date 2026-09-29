import java.util.*;

public class Modern_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice) {
            case 1 -> System.out.println("You selected choice 1");
            case 2 -> System.out.println("You selected choice 2");
            case 3 -> System.out.println("You Selected choice 3");
            default -> System.out.println("You entered rather than given");
        }
    }
}
