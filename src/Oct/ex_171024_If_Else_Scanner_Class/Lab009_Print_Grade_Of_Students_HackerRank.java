package Oct.ex_171024_If_Else_Scanner_Class;

import java.util.Scanner;

public class Lab009_Print_Grade_Of_Students_HackerRank {
    public static void main(String[] args) {
        //if marks is between 91 - 100 : Grade A
        //if marks is between 76 - 90 : Grade B
        //if marks is between 51 - 75 : Grade C
        //if marks is between 35 - 50 : Grade D
        //if marks is between 0 - 34 : Grade F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        float marks = sc.nextFloat();
        if (marks > 90 && marks < 100) {
            System.out.println("You have got A grade");
        } else if (marks > 75 && marks <= 90) {
            System.out.println("You have got B grade");
        } else if (marks > 50 && marks <= 75) {
            System.out.println("You have got C grade");
        } else if (marks >= 35 && marks < 51) {
            System.out.println("You have got D grade");
        } else if (marks < 0 || marks > 100) {
            System.out.println("It's an invalid marks");
        } else {
            System.out.println("You are failed");
        }
        sc.close();
    }
}
