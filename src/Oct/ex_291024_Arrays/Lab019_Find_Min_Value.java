package Oct.ex_291024_Arrays;

public class Lab019_Find_Min_Value {
    public static void main(String[] args){
        int [] stored_values = new int[8];
        stored_values[0]=91;
        stored_values[1]=45;
        stored_values[2]=23;
        stored_values[3]=68;
        stored_values[4]=245;
        stored_values[5]=21;
        stored_values[6]=245;
        stored_values[7]=21;
        int min_value = stored_values[0];
        for (int i=0;i<stored_values.length;i++){
            if (min_value>stored_values[i]){
                min_value=stored_values[i];
            }
        }
        System.out.println(min_value);

    }
}
