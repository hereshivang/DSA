package Stack;

import java.util.Stack;

public class NextSmaller {
    public static void next(int arr[], int nxt[]){
        Stack<Integer> stk = new Stack<>();
        // 1. Backward Traversal
        for(int i=arr.length-1;i>=0;i--){
            // 2. Stack operations
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            // If-Else
            if(stk.isEmpty()){
                nxt[i] = -1;
            }
            else {
                nxt[i] = arr[stk.peek()];
            }
            // 3. push
            stk.push(i);
        }

        for(int i=0;i< nxt.length;i++){
            System.out.print(nxt[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nxt[] = new int[arr.length];
        next(arr,nxt);
    }
}
