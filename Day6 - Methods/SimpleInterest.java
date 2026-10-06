public class SimpleInterest {
    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        System.out.println("Simple Interest Calculation for 15000.00 principal amount with 2 rate for 3.5 years is : " + calculateSimpleInterest(15000.00, 2, 3.5));
    }
}
