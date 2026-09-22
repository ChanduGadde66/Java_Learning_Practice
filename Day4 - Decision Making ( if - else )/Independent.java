import java.util.*;

public class Independent {
    public static void main(String[] args) {
        int age = 18;
        if(age == 0) {
            System.out.println("You are just born ");
        }
        if(age > 12 ) {
            if(age <=19 ) {
                System.out.println("You are a nested Teenager");
            }
        }
        if(age > 12) {
            System.out.println("You are a adult");
        }
        if(age >= 13 && age <= 19 ) {
            System.out.println("You are a teenager");
        }
    }
}
