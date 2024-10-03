public class Coin_Comb {
    public static void printPermWithREPEAT(int coins[],int amt,String ans,int idx){

        if(amt == 0){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<coins.length;i++){
            if(amt >= coins[i]){
                printPermWithREPEAT(coins,amt-coins[i],ans+coins[i],i);

            }
        }
    }
    public static void printPermWithNO_REPEAT(int coins[],int amt,String ans,int idx){

        if(amt == 0){
            System.out.println(ans);
            return;
        }
        for(int i=idx+1;i<coins.length;i++){
            if(amt >= coins[i]){
                printPermWithREPEAT(coins,amt-coins[i],ans+coins[i],i+1);

            }
        }
    }
    public static void main(String[] args) {
        int [] coins = {2,3,5,6};
        int amt = 10;
        System.out.println("-----------------Repeating Allowed--------------");
        printPermWithREPEAT(coins,10,"",0);
        System.out.println("-----------------NO Repeating Allowed--------------");
        printPermWithNO_REPEAT(coins,10,"",-1);
    }
}
