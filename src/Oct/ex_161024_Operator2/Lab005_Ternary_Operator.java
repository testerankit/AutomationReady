package Oct.ex_161024_Operator2;

public class Lab005_Ternary_Operator {
    public static void main(String[] args) {
        //Find out the largest number
        int a = 18;
        int b = 15;
        int c = 80;

        int result = (a>b && a>c ? a : (b>c ? b : c));
        System.out.println("Largest number is " +result);
    }
}