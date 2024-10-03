public class Quicksort {
    public static void quick(int arr[], int si, int ei) {
        //Base Case
        if(si >= ei){
            return;
        }

        //Recursive Calls
        int pIdx = pivot(arr,si,ei);
        quick(arr,si,pIdx-1);// Left
        quick(arr,pIdx+1,ei);// Right
    }
    public static int pivot(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // Jagah Banata hai

        for (int j=si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                //Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++; // pivot index
        int temp = pivot;
        arr[ei] = arr[i]; // pivot change nhi krna hai
        arr[i] = temp;

        return i;
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,5,10,4,1,11};
        quick(arr,0,arr.length-1);
        print(arr);
    }
}
