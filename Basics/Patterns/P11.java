package Basics.Patterns;

import java.util.Scanner;

public class P11 {
    public static void solidRhombus(int rows){
        System.out.println("Solid Rhombus");
        // Outer Loop - for no of rows
        for(int i=1; i<=rows; i++){

            // Spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void hollowRhombus(int rows){
        System.out.println("Hollow Rhombus");
        for(int i=1; i<=rows; i++){
            // Spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=rows; j++){
                if(i==1 || i== rows || j == 1 || j == rows){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        solidRhombus(rows);
        hollowRhombus(rows);
    }
}
