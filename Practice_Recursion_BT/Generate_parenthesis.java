package Practice_Recursion_BT;

public class Generate_parenthesis {
    public static void genParen(int n,int open, int close, String ans){
        if(open==n && close == n){
            System.out.print(ans + " ");
            return;
        }
        if(open < n){
            genParen(n,open+1, close,ans+"(");
        }
        if(close < open){
            genParen(n,open,close+1,ans+")");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        genParen(n,0,0,"");
    }
}
