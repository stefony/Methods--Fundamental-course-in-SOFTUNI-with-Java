package Metods0710_OK;

import java.util.Scanner;

public class P18_Factorial_Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        long fact1 = calculateFactorial(number1); //факториела на първото число


        long fact2 = calculateFactorial(number2); //факториела на второто число


        double divisionResult = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", divisionResult);
    }


    public static long calculateFactorial(int number) {


        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
