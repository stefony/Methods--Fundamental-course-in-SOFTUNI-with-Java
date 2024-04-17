package Metods0510_ok;

import java.util.Scanner;

public class P06_Calculate_Rectangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int sum = getAreaOfRectangle(width,length);
        System.out.println(sum);

    }

    public static int getAreaOfRectangle (int width,int length){
        return width*length;

    }
}
