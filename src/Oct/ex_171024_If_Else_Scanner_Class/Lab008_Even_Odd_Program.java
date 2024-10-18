package Oct.ex_171024_If_Else_Scanner_Class;

import java.util.Scanner;

public class Lab008_Even_Odd_Program {
    public static void main(String[] args) {
        //Find even or odd
        //int num = 18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println(num +" is a even number");
        }else
        {
            System.out.println(num +" is an odd number");
        }
        sc.close();
    }
}

