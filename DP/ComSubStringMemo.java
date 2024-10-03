package DP;

public class ComSubStringMemo {
    public static int subString(String str1, String str2, int n, int m, int dp[][]){
        if(n==0 || m==0) return 0;

        if(dp[n][m] != -1){
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = subString(str1,str2,n-1,m-1,dp);
            return dp[n][m];
        }

        int ans1 = subString(str1,str2,n-1,m,dp);
        int ans2 = subString(str1, str2,n,m-1,dp);
        dp[n][m] =  Math.max(0,dp[n][m]);
        return dp[n][m];

    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABSD";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[n][m] = -1;
            }
        }
        int res = subString(str1,str2,n,m,dp);
        System.out.println(res);
    }
}
