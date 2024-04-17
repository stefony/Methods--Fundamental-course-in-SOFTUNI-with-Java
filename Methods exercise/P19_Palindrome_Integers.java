package Metods0710_OK;

import java.util.Scanner;

public class P19_Palindrome_Integers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")){
            if (!palindromeNumber(number)){
                System.out.println("false");
            }else {
                System.out.println("true");
            }
            number= scanner.nextLine();
        }

    }
    public static boolean palindromeNumber (String number){
         String reversString = "";
        for (int i = number.length()-1; i >=0 ; i--) {
        reversString+= number.charAt(i);
        }
        return number.equals(reversString);
    }


}
