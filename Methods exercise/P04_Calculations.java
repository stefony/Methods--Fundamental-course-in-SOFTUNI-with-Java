package Metods0510_ok;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        switch (textInput){
            case "add":
                addNumbers(number1,number2);
                break;
            case "multiply":
                multiplyNumbers(number1,number2);
                break;
            case "subtract":
                subtractNumbers(number1,number2);
                break;
            case "divide":
                divideNumbers(number1, number2);
        }

    }

    public static void addNumbers(int firstNumber,int secondNumber){
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
    }
    public static void multiplyNumbers(int firstNumber,int secondNumber){
        int sum = firstNumber * secondNumber;
        System.out.println(sum);
    }
    public static void subtractNumbers(int firstNumber,int secondNumber){
        int sum = firstNumber - secondNumber;
        System.out.println(sum);
    }
    public static void divideNumbers(int firstNumber,int secondNumber){
        int sum = firstNumber / secondNumber;
        System.out.println(sum);
    }
}
