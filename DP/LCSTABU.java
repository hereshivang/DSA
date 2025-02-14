package DP;

public class LCSTABU {
    public static int lcsTabu(String str1, String str2, int n, int m, int dp[][]) {
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++) {
                if(str1.charAt(n-1) == str2.charAt(m-1)){
                    return dp[n][m] = dp[i-1][j-1] +1;
                }
                else {
                    int ans1 = dp[i-1][m] ;
                    int ans2 = dp[n][j-1] ;
                    return dp[n][m] = Math.max(ans1, ans2);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcsTabu(str1,str2,n,m,dp));
    }
}
