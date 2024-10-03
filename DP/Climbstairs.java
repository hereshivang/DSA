package DP;

public class Climbstairs {
    public static int stairsMemo(int n,int dp[]){
        if(n<0) return 0;
        if(n==0 || n==1) return 1;

        if(dp[n] != 0 && dp[n] != 1) return dp[n];

        dp[n] = stairsMemo(n-1, dp) + stairsMemo(n-2, dp);
        return dp[n];
    }
    public static int stairsTab(int n,int dp[]){
        if(n<0) return 0;
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[n] = dp[n-1] + dp[n-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        System.out.println(stairsMemo(n,dp));
        System.out.println(stairsTab(n,dp));
    }
}
