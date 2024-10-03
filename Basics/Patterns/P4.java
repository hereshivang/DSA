package Basics.Patterns;

import java.util.Scanner;

public class P4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cols = sc.nextInt();
        int i,j;

        // Outer Loop
        for (i = 1; i < cols; i++) {

            // 2 Inner Loop - Space Wala
            for (j = 2* (cols- i); j >=1; j--) {
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
