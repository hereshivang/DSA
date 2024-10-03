package Basics.Patterns;

import java.util.Scanner;

public class P3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cols = sc.nextInt();
        // Outer Loop
        for(int i=0; i<=cols;i++){
            // Star Printing
            for(int j=0; j<=cols;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
