package Metods0710_OK;

import java.util.Scanner;

public class P15_Add_and_Subtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int sum = sumNumbers(num1,num2);
        int subtract =subtractNumbers(sum,num3);

        System.out.println(subtract);

    }
    public static int sumNumbers (int n1,int n2){
        return n1 + n2;
    }
    public static int subtractNumbers(int n1, int n2){
        return n1 - n2;
    }

}
