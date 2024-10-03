package Basics.Arrays;

import java.util.Scanner;

public class buubleSort {

    public static void sortArray(int arr[], int size){

        for(int i=0; i<size;i++){
            //int swap = 0;
            for(int j=i+1;j<size;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    //swap++;
                }
            }

        }
    }

    public static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        sortArray(arr,size);
        printArray(arr,size);
    }
}
