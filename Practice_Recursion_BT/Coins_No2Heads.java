package Practice_Recursion_BT;

public class Coins_No2Heads {
    public static void coins(int toss,String ans){
        if(toss==0){
            System.out.print(ans + " ");
            return;
        }
        // 1. Answer ki Length, 0 toh nhi hai
        // 2. Last Character jo hai wo Head na ho
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
            coins(toss-1,ans+'H');
        }

            coins(toss-1,ans+'T');


    }
    public static void main(String[] args) {
        int toss = 2;
        coins(toss,"");
    }
}
