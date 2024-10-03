package Basics.Patterns;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diamond Pattern");
        int cols = sc.nextInt();
        //1st Half
        int i,j;

        // Outer Loop
        for (i = 1; i <=cols; i++) {

            // 2 Inner Loop - Space Wala
            for (j = (cols- i); j >= 1; j--) {
                System.out.print(" ");
            }

            // 3rd Loop - Star Wala
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Next Line
            System.out.println();
        }


        // 2nd Half
        // Outer Loop
        for (i = cols; i >=1; i--) {

            // 2 Inner Loop - Space Wala
            for (j = (cols- i); j >= 1; j--) {
                System.out.print(" ");
            }

            // 3rd Loop - Star Wala
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Next Line
            System.out.println();
        }
    }
}

