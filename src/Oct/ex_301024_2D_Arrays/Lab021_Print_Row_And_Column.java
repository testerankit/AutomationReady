package Oct.ex_301024_2D_Arrays;

import java.util.Arrays;

public class Lab021_Print_Row_And_Column {
    /* Print below pattern
    1 2 3
    4 5 6
    7 8 9
     */

    public static void main(String[] args) {
        int[][] num = {{1, 2, 3},{4,5,6},{7,8,9}};
        for(int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
