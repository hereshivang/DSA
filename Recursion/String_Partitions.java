package Recursion;

public class String_Partitions {
    public static void main(String[] args) {
        String str = "NITIN";
        String ans = "";
        parts(str,ans);
    }
    public  static void parts(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=str.length();i++){
            parts(str.substring(i),ans+str.substring(0,i)+"| ");
        }
    }
}
