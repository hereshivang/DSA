package Practice_Recursion_BT;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int fct = n * fact(n-1);
        return fct;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(n));
    }
}
