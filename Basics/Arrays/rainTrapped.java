package Basics.Arrays;

public class rainTrapped {
    public static void trappedWater(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        //Left Max Array
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i]);
        }

        //Right Max Array
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        //Loop

        int trapWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapWater += waterLevel - arr[i];
        }
        System.out.println(trapWater);


    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        trappedWater(arr);
    }
}
