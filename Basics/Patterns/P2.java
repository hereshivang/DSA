package Basics.Patterns;

import java.util.Scanner;

public class P2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cols = sc.nextInt();

        // Outer loop - Cols
        for(int i=cols; i>=0;i--){
            // Star Printing
            for(int j=i; j>=0;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
