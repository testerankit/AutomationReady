package Oct.ex_301024_2D_Arrays;

public class Lab022_Print_Right_Triangle {
    public static void main(String[] args) {
        /* Print below
        *
        * *
        * * *
        * * * *
        * * * * *
         */

        int pattern = 5;
        for(int i=0;i<5;i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
