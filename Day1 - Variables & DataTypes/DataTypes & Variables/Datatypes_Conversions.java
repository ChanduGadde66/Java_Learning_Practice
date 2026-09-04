public class Datatypes_Conversions {
    public static void main(String[] args) {
        int age = 38;
        byte real_age = (byte) age;
        System.out.println(real_age); // Widening conversion

        byte weight = 65;
        int myWeight = weight;
        System.out.println(myWeight); // Narrow Conversion
    }
}
