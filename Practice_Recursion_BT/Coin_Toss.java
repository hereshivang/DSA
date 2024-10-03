package Practice_Recursion_BT;

public class Coin_Toss {
    public static void coin(int toss,String ans) {
        if(toss==0){
            System.out.print(ans + " ");
            return;
        }

        coin(toss-1,ans+"H");
        coin(toss-1,ans+"T");


    }
    public static void main(String[] args) {
        int toss = 3;
        coin(toss,"");

    }
}
