package Homework01;

public class Homework01_3 {

    public static void main(String[] args) {
        String str1 = "    I love you baby.   ";
        String str2 = str1.trim();
        String str3 = str2.substring(0,2);
        String str4 = str2.substring(6);
        System.out.println(str3 + "hate" + str4);
    }
}
