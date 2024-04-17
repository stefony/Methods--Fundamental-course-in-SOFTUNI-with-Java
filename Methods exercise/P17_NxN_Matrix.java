package Metods0710_OK;

import java.util.Scanner;

public class P17_NxN_Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        extracted(n);

    }

    public static void extracted(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
             }
    }
}
