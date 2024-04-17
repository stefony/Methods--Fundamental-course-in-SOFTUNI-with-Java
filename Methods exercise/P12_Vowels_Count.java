package Metods0710_OK;

import java.util.Scanner;

public class P12_Vowels_Count {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printsTheCount(text.toLowerCase());
    }

    public static void printsTheCount(String text){
        int count = 0;
        for (char symbol: text.toCharArray()) {
            if (symbol == 'a' || symbol=='e' || symbol=='i' || symbol=='o' || symbol=='u'){
            count++;
            }

        }
        System.out.println(count);

    }
}
