public class Coin_perm {
    public static void printPerm(int coins[],int amt,String ans){
        if(amt == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coins.length;i++){
            if(amt >= coins[i]){
                printPerm(coins,amt-coins[i],ans+coins[i]);

            }
        }
    }
    public static void main(String[] args) {
        int [] coins = {2,3,5,6};
        int amt = 10;
        printPerm(coins,10,"");

    }
}
