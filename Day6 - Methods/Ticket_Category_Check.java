public class Ticket_Category_Check {
    static String getTicketCategory(int age) {
        if(age < 0) {
            return "Invalid";
        }
        else if(age < 5) {
            return "Infant";
        }
        else if(age < 13) {
            return "Child";
        }
        else if(age < 20) {
            return "Teen-ager";
        }
        else if(age < 60) {
            return "Adult";
        }
    return "Senior";
    }

    public static void main(String[] args) {
        System.out.println(getTicketCategory(21));
    }
}
