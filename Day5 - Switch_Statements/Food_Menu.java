import java.util.*;

class Food_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Idly * 4 (1 plate)  $1");
        System.out.println("2. Dosa * 1            $3");
        System.out.println("3. Biryani * 1         $15");
        System.out.println("4. Fried Rice * 1      $10");
        int ch;
        System.out.println("Enter Choice : ");
        ch = sc.nextInt();

        int quantity;
        int Idly_price = 1;
        int dosa_price = 3;
        int biryani_price = 15;
        int friedrice_price = 10;
        int total_price;

        switch(ch) {
            case 1 :
                     System.out.println("Enter Quantity of idly in plates : ");
                     quantity = sc.nextInt();
                     total_price = quantity * Idly_price;
                     System.out.println("The total price for idly is : " + total_price + "$");
                     break;
            case 2 :
                System.out.println("Enter Quantity of dosa in plates : ");
                quantity = sc.nextInt();
                total_price = quantity * dosa_price;
                System.out.println("The total price for dosa is : " + total_price + "$");
                break;
            case 3 :
                System.out.println("Enter Quantity of Biryani in plates : ");
                quantity = sc.nextInt();
                total_price = quantity * biryani_price;
                System.out.println("The total price for Biryani is : " + total_price + "$");
                break;
            case 4 :
                System.out.println("Enter Quantity of Fried rice in plates : ");
                quantity = sc.nextInt();
                total_price = quantity * friedrice_price;
                System.out.println("The total price for idly is : " + total_price + "$");
                break;
            default :
                System.out.println("The food item is not available now...");
        }

    }
}