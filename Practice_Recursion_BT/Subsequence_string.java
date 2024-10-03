package Practice_Recursion_BT;

public class Subsequence_string {
    static int cnt = 0;
    public static void subseq(String str,String ans){
        if(str.length()==0){
            cnt++;
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        //Pick
        subseq(str.substring(1),ans+ch);
        //Not Pick
        subseq(str.substring(1),ans);


    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subseq(str,ans);
        System.out.println(cnt);
    }
}
