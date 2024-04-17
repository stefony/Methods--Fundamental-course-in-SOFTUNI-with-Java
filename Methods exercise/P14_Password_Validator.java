package Metods0710_OK;

import java.util.Scanner;

public class P14_Password_Validator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        boolean passwordLenght = isValidLenght(password);
        if (!passwordLenght){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isPasswordValid = isValidContent(password);
        if (!isPasswordValid){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidCount = isValidCountDigit(password);
        if (!isValidCount){
            System.out.println("Password must have at least 2 digits");
        }
        if (passwordLenght&& isPasswordValid && isValidCount){
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLenght (String password){
            return password.length()>6 && password.length()<=10;
    }
    public static boolean isValidContent (String password){
        for (char symbol: password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }

        }
        return true;
    }
    public static boolean isValidCountDigit (String password){
        int contDigit = 0;
        for (char symbol: password.toCharArray()) {
            if (Character.isDigit(symbol)){
            contDigit++;
            }
        }
        return  contDigit>=2;
    }

}
