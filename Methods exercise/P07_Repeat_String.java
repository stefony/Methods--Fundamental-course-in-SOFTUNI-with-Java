package Metods0510_ok;

import java.util.Scanner;

public class P07_Repeat_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        String resulText = repeatString(text,number);
        System.out.println(resulText);

    }
    public static String repeatString ( String text, int number){
        String result = "";
        for (int i = 0; i < number; i++) {
            result+=text;
        }
        return result;
    }
}
