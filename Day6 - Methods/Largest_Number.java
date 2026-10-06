public class Largest_Number {
    int findLargest(int a, int b) {
        if(a>b) {
            return a;
        }
    return b;
    }

    public static void main(String[] args) {
        Largest_Number l = new Largest_Number();
        System.out.println(l.findLargest(10,20) );
    }
}
