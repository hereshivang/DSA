package Basics.Arrays;

import java.util.*;

public class arrayBasics {

    // Original Array Passed - Not A Copy
    public static void passArrays(int arr[]){

        for(int i=0;i<arr.length; i++){
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Size of Array : ");
        int size = sc.nextInt();
        System.out.println("Enter Index : ");
        int idx = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Input of Array : ");
        // Input of Arrays - Using Loop
        for(int i=0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Output of Array - with index");
        // Output of Array - Using Loop
        for(int i=0;i<arr.length; i++){
            System.out.println("Values Of Arrays : " + arr[i] + " at index " + i);
        }

        // Particular Value at Requesting Index
        System.out.println("Value at Index : " + arr[idx]);

        // Array Update
        arr[2] = 100;
        System.out.println("Updated Value : " + arr[2]);

        //Passing Arrays as Arguments - PASS BY REF
        passArrays(arr);
        System.out.println("After Passing Array as Ref : ");
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
