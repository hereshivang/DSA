package Basics.Arrays;

import java.util.*;

public class linearSearch {
    public static int searchKey(int numbers[], int key){

        // Time Comp : O(N)
        // Space Comp : O(N)

        for(int i=0;i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {2,4,6,8,3,6,7,8,9,0};
        System.out.println("Enter Key : ");
        int key = sc.nextInt();

        int index = searchKey(numbers,key);

        if(index == -1){
            System.out.println("Not Found!!");
        }else{
            System.out.println("Found at : " + index);
        }

    }
}

