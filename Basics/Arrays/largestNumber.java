package Basics.Arrays;
import java.util.*;
public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,8,56,34,23};
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length;i++){
            if(numbers[i] >= largest){
                largest = numbers[i];
            }
        }
        System.out.println("Largest Element : " + largest);
    }
}
