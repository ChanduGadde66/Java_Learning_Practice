public class Arithmetic_ops {
    public static void main(String[] args) {
        int firstVariable = 5;
        int secondVariable = 2;

        int addition = firstVariable + secondVariable;
        int subtraction = firstVariable - secondVariable;
        int multiplication = firstVariable * secondVariable;
        double division = (double) firstVariable/secondVariable;
        int modulus = firstVariable % secondVariable;

        System.out.println("Addition : " +addition);
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication : " +multiplication);
        System.out.println("Division : " +division);
        System.out.println("Modular Division : " +modulus);
    }
}
