package Basics.Arrays;

public class Selectionsort {
    public static void sort(int arr[]){

        for(int i=0; i< arr.length-1;i++){
            int misPos = i;
            for(int j=i+1; j<arr.length;j++){
                //Check
                if(arr[misPos] > arr[j]){
                    misPos = j;
                }
            }
            //Swap
            int temp = arr[misPos];
            arr[misPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]);;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 7 ,1, 4, 10};
        sort(arr);
        printArr(arr);
    }
}
