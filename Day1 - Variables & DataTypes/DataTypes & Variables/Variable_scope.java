public class Variable_scope {
    public static void main(String[] args) {
        int age = 21;
        int result = 100;
        if(age >= 18) {
            System.out.println(result);
        }

    }
}

/* Scope of variables plays role here if i declare variables inside if block it and print outside of block which i dclared in if block it shows error :

public class Variable_scope {
    public static void main(String[] args) {
        int age = 21;

        if(age >= 18) {
            int result = 100;

        }
        System.out.println(result);         //This displays Scope error
    }
}

 */
