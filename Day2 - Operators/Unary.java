public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int pre_increment = ++a;
        System.out.println("The updated 'a' value after doing pre-increment : " +pre_increment);
        System.out.println("The present value of a is : " +a);

        int pre_decrement = --a;
        System.out.println("The updated 'a' value after doing pre-decrement : " +pre_decrement);
        System.out.println("The present value of a is : " +a);

        int post_increment = a++;
        System.out.println("The updated 'a' value after doing post-increment : " +post_increment);
        System.out.println("The present value of a is : " +a);

        int post_decrement = a--;
        System.out.println("The updated 'a' value after doing post-decrement : " +post_decrement);
        System.out.println("The present value of a is : " +a);

    }
}
