package Basics.Arrays;

import java.util.*;

public class smallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,8,56,34,23};
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length;i++){
            if(numbers[i] <= smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Element : " + smallest);
    }
}
