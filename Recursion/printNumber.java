package Recursion;

public class printNumber {
    public static void backward(int n){
        if(n == 0){
           return;
        }
        System.out.println(n);
        backward(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        backward(n);
    }
}
