package DP;

import java.util.Arrays;

public class CatalanRec {
    public static int cal(int n){
        if(n == 0 || n == 1){
            return 1;
        }

       int ans = 0;
        for(int i=0;i<n;i++){
            ans += cal(i) * cal(n-i-1);
        }
        return ans;

    }
    public static int calMemo(int n,int dp[]){
        if(n == 0 || n == 1) return 1;

        if(dp[n] != -1){
            return dp[n];
        }

        int ans = 0;
        for(int i=0;i<n;i++){
           ans += calMemo(i,dp) * calMemo(n-i-1, dp);
        }

        return dp[n] = ans;

    }
    public static void main(String[] args) {
        int n = 100;
        //System.out.println(cal(n)); // Recursion Call
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(calMemo(n,dp)); // Memoization
    }
}
