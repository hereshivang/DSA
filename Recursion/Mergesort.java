public class Mergesort {
    public static void sort(int arr[], int si, int ei){
        //Base Case
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;
        //Recursive Calls
        sort(arr,0,mid);
        sort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1]; //Temp Array Size
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k =0; // iterator for temp array

        //Merging Both Left & Right Array
        while(i<=mid && j<=ei){

            // Compare arr[left] with arr[right]
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //Left Array Leftovers
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //Right Array Leftovers
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // Copy
        for( k=0, i= si; k<temp.length;k++ ,i++){
            arr[i] = temp[k];
        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,5,10,4,1,11};
        sort(arr,0,arr.length-1);
        print(arr);
    }
}
