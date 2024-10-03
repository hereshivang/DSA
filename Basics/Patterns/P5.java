package Basics.Patterns;

import java.util.Scanner;

public class P5 {
    // Simple Increase Counting Pattern
    public static void P1(int cols){
        System.out.println("Increase Counting Pattern");
        // Total Cols
        for(int i=1;i<=cols;i++){
            // Number Print
            int num = 1;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    // Simple Decreasing Counting Pattern
    public static void P2(int cols){
        System.out.println("Decreasing Counting Pattern");
        for(int i=cols;i>=1;i--){
            // Number Print
            int num = 1;
            for(int j=i;j>=1;j--){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cols = sc.nextInt();
        P1(cols);
        P2(cols);

    }
}
