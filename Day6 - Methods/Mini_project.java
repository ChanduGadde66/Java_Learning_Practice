import java.util.*;

public class Mini_project {

    static double subTotal(double price, int quantity) {
        return price * quantity;
    }
    static double calculateDiscount(double price, int quantity) {
        return subTotal( price, quantity ) * 20/100;
    }
    static double finalAmount(double price, int quantity) {
        return subTotal(price,quantity) - calculateDiscount(price,quantity);
    }
    static void displayBill(double price, int quantity ) {
        System.out.println(finalAmount(price,quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tell me the product name you take : "  );
        String product_name = sc.nextLine();
        System.out.print("Enter the price of the product you taken : " );
        double price = sc.nextDouble();
        System.out.print("Enter the Quantity you taken : " );
        int quantity = sc.nextInt();

        displayBill(price, quantity);
    }
}
