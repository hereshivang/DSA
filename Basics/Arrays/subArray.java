package Basics.Arrays;

import java.util.Scanner;

public class subArray {
    public static void subArrays(int arr[], int size) {
        System.out.println("Sub Arrays : ");
        int ts =0;
        for (int i = 0; i < size; i++) {
            for (int j = i ; j < size; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays : " + ts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Input
        System.out.println("Enter Elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        subArrays(arr,size);

    }
}
