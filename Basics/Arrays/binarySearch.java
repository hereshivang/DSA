package Basics.Arrays;

import java.util.*;

public class binarySearch {
    public static int binarySearching(int arr[],int key){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(mid < key){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,5,6,7,8,9,10};
        int key = 10;
        System.out.println("Key Found at index : " + binarySearching(arr,key));
    }
}
