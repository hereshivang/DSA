package Basics.Arrays;

import java.util.*;
public class reverseArray {
    public static void reverseArrayElem(int arr[]){
        System.out.print("Reverse Array Elements : ");
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverseArrayElemOptimised(int arr[]){
        System.out.println();
        System.out.println("Optimised Version");
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
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

        // TC = O(N) and SC = O(N)
        // Here, We have created new array so SC = O(N)
        reverseArrayElem(arr);
        // TC = O(N) and SC = O(1)
        // Reason : Space has optimised coz We have just swap elements of arrays without
        // creating new array
        reverseArrayElemOptimised(arr);

        for(int i=0; i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
