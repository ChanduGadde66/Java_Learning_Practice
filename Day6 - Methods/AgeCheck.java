public class AgeCheck {
    static boolean isEligible(int age) {
        if(age>18) {
            return true;
        }
    return false;
    }

    public static void main(String[] args) {
        if(isEligible(15)) {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}
