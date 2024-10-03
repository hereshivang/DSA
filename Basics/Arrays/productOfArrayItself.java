package Basics.Arrays;

public class productOfArrayItself {
    public static int[] product(int arr[]){

        int n = arr.length - 1;
        int left[] = new int[n];
        int right[] = new int[n];

        //Left Product Array - Skip ith Element
        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }

        //Right Product Array - Skip ith Element
        right[n-1] = 1;
        for(int i = n - 2; i>=0; i--){
            right[i] = right[i+1] * arr[i+1];
        }

        //Final Product Array
        for(int i=0;i<right.length;i++){
            arr[i] = left[i] * right[i];
        }

        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6};

        int ans [] = product(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
