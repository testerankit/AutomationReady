package Oct.ex_231024_Functions;

import java.util.Scanner;

public class Lab013_Add_Sub_Mult_Div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int result_add = sum_of_numbers(a,b);
        System.out.println("Sum of number is: "+result_add);

        int result_sub = sub_of_numbers(a,b);
        System.out.println("Sub of number is: "+result_sub);

        int result_mult = mult_of_numbers(a,b);
        System.out.println("Mult of number is: "+result_mult);

        int result_div = div_of_numbers(a,b);
        System.out.println("Div of number is: "+result_div);

        int result_mod = modulas_of_numbers(a, b);
        System.out.println("Modulas of number is: "+result_mod);
    }

    private static int div_of_numbers(int a, int b) {
        return a/b;
    }

    private static int mult_of_numbers(int a, int b) {
        return a*b;
    }

    private static int sub_of_numbers(int a, int b) {
        return a-b;
    }

    private static int sum_of_numbers(int a, int b) {
        return a+b;
    }

    private static int modulas_of_numbers(int a, int b){
        return a%b;
    }
}
