public class Assignment_1 {
    public static void main(String[] args) {
        int marks = 70;
        double attendance = 74.1;

        boolean result = marks >= 40 && attendance >= 75;

        String eligibility_check = result ? "Eligible " : "Not Eligible";

        System.out.println(eligibility_check);
    }
}
