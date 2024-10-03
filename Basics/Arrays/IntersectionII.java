package Basics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionII {
    public static void main(String[] args) {
        int[] arr1 = {4,9,6};
        int[] arr2 = {4,7,8,9,4,9};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> list = new ArrayList<>();
        int i =0, j=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
}
