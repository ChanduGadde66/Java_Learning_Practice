import java.util.*;

public class Mini_BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 500;
        System.out.println("1.Check Balance ");
        System.out.println("2.Deposit ");
        System.out.println("3.Withdraw ");
        System.out.println("4.Exit ");
        System.out.print("Enter choice : ");
        int ch = sc.nextInt();

        switch(ch) {
            case 1 :
                System.out.println("Your account balance is : " + balance);
                break;
            case 2 :
                System.out.print("Enter the money you want to deposit : ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("You deposited " + deposit + " rupees and your current balance is : " +balance );
                break;
            case 3 :
                System.out.print("Enter the money you want to withdraw : ");
                int withdraw = sc.nextInt();
                if(balance > withdraw ) {
                    balance -= withdraw;
                    System.out.println("You withdraw " + withdraw + " rupees and your current balance is : " + balance);
                }
                else {
                    System.out.println("You don't have " +withdraw + " rupees in your account to withdraw.");
                }
                break;
            case 4 :
                System.out.println("Thank you for utilizing bank services, visit again ");
                break;
            default :
                System.out.println("Enter a valid choice ");
        }

        sc.close();
    }
}
