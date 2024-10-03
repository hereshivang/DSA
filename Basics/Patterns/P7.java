package Basics.Patterns;

import java.util.Scanner;

public class P7 {
    public static void halfPyramid(int cols){
        System.out.println("Half Pyramid");
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
    }

    public static void inverseHalfPyramid(int cols){
        System.out.println("Inverse Half Pyramid");
        int i,j;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cols = sc.nextInt();
        halfPyramid(cols);
        inverseHalfPyramid(cols);

    }
}

