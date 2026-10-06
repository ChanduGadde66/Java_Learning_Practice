import java.util.*;

public class Grade_Checker {
    static String getGrade(int marks) {
        if(marks > 90) {
            return "A Grade";
        }
        else if(marks >= 75) {
            return "B Grade";
        } else if (marks >= 60 ) {
            return "C Grade";
        }
        else if(marks > 40) {
            return "D Grade";
        }
    return "Fail";
    }

    public static void main(String[] args) {
        System.out.println(getGrade(96));
    }
}
