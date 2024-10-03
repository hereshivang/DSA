package DP;

public class ComSubStringRec {
    public static int subString(String str1, String str2, int n, int m,int cnt){
        if(n==0 || m==0){
            return cnt;
        }

        // same
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            cnt = subString(str1,str2,n-1,m-1, cnt+1);
        }
        // Different

            int ans1 = subString(str1,str2,n-1,m,0);
            int ans2 = subString(str1,str2,n,m-1,0);
            cnt = Math.max(cnt,Math.max(ans1,ans2));
            return cnt;

    }
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "AB";
        int n = str1.length();
        int m = str2.length();
        int ans = subString(str1,str2,n,m,0);
        System.out.println(ans);
    }
}
