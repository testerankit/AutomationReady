package Oct.ex_151024;

public class Lab004 {
    public static void main(String[] args) {
        int a = 15;
        int result = a--;
        System.out.println(result);
        //15

        System.out.println(--a + a-- + result - a);
        //14+14+14-13=29

    }
}
