package Oct.ex_291024_Arrays;

public class Lab018_Find_Max_Value {
    public static void main(String[] args) {
        int[] storedValues = {5,9,34,4,23,56,95,23};
        int maxValue = storedValues[0];
        for (int storedValue : storedValues) {
            if (maxValue < storedValue) {
                maxValue = storedValue;
            }
        }
        System.out.println(maxValue);
    }
}
