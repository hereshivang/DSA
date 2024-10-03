package DP;
import java.util.*;
public class MinCost {
    public static int minCost(int cost[], int n, int dp[]){
        if(n<0) return cost[0];

        if(n == 0 || n == 1) return cost[n];

        if(dp[n] != -1) return dp[n];

        dp[n] = cost[n] + Math.min(minCost(cost, n-1, dp) , minCost(cost, n-2, dp));
        return dp[n];

    }
    public static void main(String[] args) {
        int cost[] = {1,100,1,1,1,100,1,1,100,1};
        int n = cost.length;
        int dp[] = new int[n+1];
        for(int i=0;i<n;i++) {
            dp[i] = -1;
        }
        System.out.println(minCost(cost, n, dp));
    }
}
