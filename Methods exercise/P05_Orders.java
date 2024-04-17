package Metods0510_ok;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputProduct = scanner.nextLine();
        int  quantity = Integer.parseInt(scanner.nextLine());

        switch (inputProduct){
            case "coffee":
           getTotalSum(quantity,1.5);
           break;
            case "water":
                getTotalSum(quantity,1.0);
                break;
            case "coke":
                getTotalSum(quantity,1.40);
                break;
            case "snacks":
                getTotalSum(quantity,2.0);
                break;
        }
    }
     public static void getTotalSum(int quantity, double price ){
        double sum = quantity * price;
        System.out.printf("%.2f",sum);

    }
}
