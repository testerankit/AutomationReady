package Oct.ex_281024_Strings_Functions_Arrays;

public class Lab016_String_Functions {
    public static void main(String[] args) {
        String str1 = "I am travelling next week";
        String str2 = String.valueOf(str1.indexOf("e"));
        System.out.println(str2);

        String str3 = String.valueOf(str1.lastIndexOf("e"));
        System.out.println(str3);

        String str4 = str1.replace("n" , "M");
        System.out.println(str4);

        String str5 = String.valueOf(str1.charAt(7));
        System.out.println(str5);

        String str6 = str1.substring(7 , 13);
        System.out.println(str6);

        String str7 = str1.substring(7);
        System.out.println(str7);

        String str8 = str1.concat(" again");
        System.out.println(str8);

        String str9 = str1.replace("ling","");
        System.out.println(str9);

        String str10 = str1.replaceAll("e"," ");
        System.out.println(str10);

        String str11 = str1.repeat(3);
        System.out.println(str11);

        String str12 = str1.trim();
        System.out.println(str12);

        String str13 = String.valueOf(str1.compareTo("I am travelling next week"));
        System.out.println(str13);

        String str14 = String.valueOf(str1.length());
        System.out.println(str14);

        String name = "Ankit,Ajay,Rohit,Rajesh,Akash,Kuldeep-Shukla";
        String[] newName = name.split(",");
        for(int i=0;i< newName.length-3;i++){
            System.out.println(newName[i]);
        }
    }
}
