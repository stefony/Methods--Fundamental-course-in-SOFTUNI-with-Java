package Metods0710_OK;

import java.util.Scanner;

public class P20_Top_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            if (isSumDivisible(i) && isOddDigit(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isSumDivisible (int num){
        int sum = 0;
        while (num>0) {
            int element = num % 10;
            sum += element;
            num = num / 10;
        }
        return sum % 8==0;

    }
    public static boolean isOddDigit (int num){
            while (num>0){
                int last = num % 10 ;
                if (last % 2 !=0){
                    return true;
                }else {
                    num = num /10;
                }

            }
            return false;
    }
}
