package Basics.Patterns;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butterfly Pattern");
        int cols = sc.nextInt();

        // 1st Half
        // Cols
        for(int i=1;i<=cols;i++){

            //Star - i times
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Spaces - Even Spaces
            for(int j=1; j<=2*(cols-i); j++){
                System.out.print(" ");
            }

            // Star - i times
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Next Line
            System.out.println(" ");
        }

        // 2nd Half
        for(int i=cols;i>=1;i--){

            //Star - i times
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // Spaces - Even Spaces
            for(int j=1; j<=2*(cols-i); j++){
                System.out.print(" ");
            }

            // Star - i times
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Next Line
            System.out.println(" ");
        }

    }
}
