package Basics.Arrays;

import java.util.*;

public class chocoDistribution {
    public static int minDiffer(int arr[], int m){
        //Edge Case
        if(arr.length==0 && m==0){
            return 0;
        }

        //Sorting Arrays
        Arrays.sort(arr);

        //No of Students should not be more than arr size
        if(arr.length-1 < m){
            return -1;
        }

        int miniDiff = Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            int subSet = i + m -1;

            //Array Out of Bound
            if(subSet >= arr.length){
                break;
            }

            int diff = arr[subSet] - arr[i];

           miniDiff = Math.min(miniDiff,diff);

        }
        return miniDiff;
    }
    public static void main(String[] args) {
        int arr[] = {7,3,2,4,9,12,56};
        int m = 3;

        int res = minDiffer(arr, m);
        System.out.println(res);
    }
}
