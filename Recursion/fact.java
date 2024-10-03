package Recursion;

public class fact {
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int ft = factorial(n-1);
        return ft * n;
    }
    public static void main(String[] args) {
        int n = 5;
       // factorial(n);
        System.out.println(factorial(n));
    }
}
