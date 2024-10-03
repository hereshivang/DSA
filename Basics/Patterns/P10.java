package Basics.Patterns;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hollow Rectangle");
        System.out.println("Rows of Rectangle : ");
        int rows = sc.nextInt();
        System.out.println("Cols of Rectangle : ");
        int cols = sc.nextInt();

        for(int i=1;i<=rows;i++){
            //Star Print
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
