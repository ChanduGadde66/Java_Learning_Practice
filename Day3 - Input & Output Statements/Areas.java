import java.util.*;

public class Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2 * (length + breadth );
        System.out.println("The area of rectangle : " + area);
        System.out.println("The perimeter of rectangle : " +perimeter);
    }
}
