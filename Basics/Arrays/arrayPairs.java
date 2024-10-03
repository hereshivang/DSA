package Basics.Arrays;

import java.util.*;

public class arrayPairs {
    public static void pairsArrays(int arr[], int size){
        int tp =0;
        for(int i=0; i<size;i++){
            int curr = arr[i];
            for(int j=i+1; j<size;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + tp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter Elements : ");
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        pairsArrays(arr,size);

        // Total Pairs : n*(n-1)/2
        // TC = O(N^2)

    }
}
