package Metods0510_ok;

import java.util.Scanner;

public class P09_Greater_of_Two_Values {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String type = scanner.nextLine();
        switch (type){
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first,second));
                break;
            case "char":
                char symbol1= scanner.nextLine().charAt(0);
                char symbol2= scanner.nextLine().charAt(0);
                System.out.println(getMax(symbol1,symbol2));
                break;
            case "string":
                String text1= scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1,text2));
                break;
        }
    }
            public static int getMax (int first, int second){
                if (first>second){
                    return first;
                }else {
                    return second;
                }
            }
            public static char getMax (char symbol1,char symbol2){
                if (symbol1>symbol2){
                    return symbol1;
                }else {
                    return symbol2;
                }
            }
            public static String getMax(String text1, String text2){
            if (text1.compareTo(text2)>=0){
                return text1;

            }else {
                return text2;
            }
            }
}
