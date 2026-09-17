import java.util.*;

public class Mini_Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item you want to take : " );
        String product_name = sc.nextLine();
        System.out.println("Enter the price of product  : ");
        double price = sc.nextDouble();
        System.out.println("The product " + product_name + " is " + price + " $");
        System.out.println("Enter the quantity you have to take : ");
        int quantity = sc.nextInt();
        double total_price = price * quantity;
        System.out.println("The total price for the " + quantity + " " + product_name + "'s is : " + total_price + " $" );
    }
}
