package Basics.Arrays;

public class containerWithMostWater {
    public static void mostWater(int arr[],int n){
        //Two Pointer
        int left = 0;
        int right = arr[n-1];
        int maxArea = 0;

        while(left < right){
            int currArea = Math.min(arr[left],arr[right]) * (right - left);
            maxArea = Math.max(currArea, maxArea);

            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int n = 9;
        mostWater(arr,9);
    }
}
