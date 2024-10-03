package DP;

public class fibo {
    public static int fib(int n, int dp[]) {
        // Base Case
        if(n == 0 || n == 1) return n;

        // Already Calculated
        if(dp[n] != 0) {
            return dp[n];
        }

        // DP Calls
        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        System.out.println(fib(n, dp));
    }
}
