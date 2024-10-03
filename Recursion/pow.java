package Recursion;
import java.util.*;
public class pow {
    public static int power(int a , int b) {
        if(b == 0){
            return 1;
        }
        int pow = power(a,b-1);
        return pow*a;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(power(a,b));
    }
}
