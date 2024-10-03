package Practice_Recursion_BT;

public class N_Fibonacci {
    public static int printFibo(int n){

        // Base Case
        if(n==0 || n==1){
            return n;
        }
        // Recursive Calls
        int f1 = printFibo(n-1);
        int f2 = printFibo(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = printFibo(n);
        System.out.println(ans);
    }
}
