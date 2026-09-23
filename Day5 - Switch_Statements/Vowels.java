import java.util.*;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lower alphabet character : ");
        char letter = sc.next().charAt(0);
        switch(letter) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("it is vowel ");
                break;
            default :
                System.out.println("It is a consonant ");
        }
    }
}
