package Basics.Arrays;
import java.util.*;
public class maxSumArray {
    public static void maxSumArrays(int arr[], int size){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0;i<size;i++){
            for(int j =i;j<size;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }

        }
        System.out.println("Max Sum : " +maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // Input
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        maxSumArrays(arr, size);
    }
}
