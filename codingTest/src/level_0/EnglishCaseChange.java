package level_0;

import java.util.ArrayList;
import java.util.Scanner;

public class EnglishCaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)<=90){
                answer+=(char)(a.charAt(i)+32);
            }else{
                answer+=(char)(a.charAt(i)-32);
            }
        }
        System.out.println(answer);
    }
}
