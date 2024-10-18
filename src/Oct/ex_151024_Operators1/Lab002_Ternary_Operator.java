package Oct.ex_151024_Operators1;

public class Lab002_Ternary_Operator {
    public static void main(String[] args) {
        //if score is greater than 90 then grade A
        //if score is greater than 75 then grade B
        //if score is greater than 50 then grade C
        //if score is greater than 35 then grade D
        //if score is less than 35 then Fail
        int Score = 45;
        String grade = Score>90 ? "A":(Score>75 ? "B":(Score>50 ? "C":(Score>35 ?"D":"FAIL")));
        System.out.println(grade);
    }
}
