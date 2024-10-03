package Practice_Recursion_BT;

public class PrintNumbers {
    public static void printInc(int n){
        if(n<=0){
            return;
        }

        printInc(n-1);
        System.out.println(n);

    }
    public static void prinDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        prinDec(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printInc(n);
        //prinDec(n);
    }
}
