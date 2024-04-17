package Metods0510_ok;

import java.util.Scanner;

public class P01_Sign_of_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());

        printNumber(numInput);
    }
    public static void printNumber(int num){
        if (num<0){
            System.out.printf("The number %d is negative.",num);
        }
        else if (num>0){
            System.out.printf("The number %d is positive.",num);
        }
        else {
            System.out.printf("The number %d is zero.",num);
        }
    }
}
