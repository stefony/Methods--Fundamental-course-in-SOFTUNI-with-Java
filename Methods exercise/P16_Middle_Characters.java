package Metods0710_OK;

import java.util.Scanner;

public class P16_Middle_Characters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacter(text);
    }
    public static void printMiddleCharacter (String text){

         if (text.length()%2!=0){
            int index = text.length()/2;
             System.out.println(text.charAt(index));
         }else {
            int firstSymbol =text.length()/2-1 ;
             int secondSymbol = text.length()/2;
             System.out.println(text.charAt(firstSymbol) + "" + text.charAt(secondSymbol));
         }
    }
}
