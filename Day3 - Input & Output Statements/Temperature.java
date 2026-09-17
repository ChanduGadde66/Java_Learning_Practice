import java.util.*;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius : ");
        double celsius = sc.nextDouble();
        double fahrenheit = ( celsius* 9/5 ) + 32;
        System.out.println("The temperature in fahrenheit is : " + fahrenheit);
    }
}
