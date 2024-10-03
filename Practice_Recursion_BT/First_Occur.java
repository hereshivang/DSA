package Practice_Recursion_BT;

public class First_Occur {
    public static int firstOcc(int arr[],int idx,int target){
        //Base Case
        if(idx > arr.length){
            return -1;
        }
        if(arr[idx] == target) return idx;

        return firstOcc(arr,idx+1,target);

    }
    public static int lastOcc(int arr[],int len,int target){
        //Base Case
        if(len < 0){
            return -1;
        }
        if(arr[len] == target) return len;

        return lastOcc(arr,len-1,target);

    }
    public static void main(String[] args) {
        int[] arr = { 2, 13, 7, 5, 3, 4, 5, 6, 3, 9, 3 };
        System.out.println(firstOcc(arr,0,3));
        System.out.println(lastOcc(arr,10,3));
    }
}
