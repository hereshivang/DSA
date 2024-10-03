package Basics.Patterns;
import java.util.*;

public class P1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Outer Loop - Print no of Stars in a cols
        for(int i=0;i<n;i++){
            // Inner Loop - Print no of Stars in a row
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            // Next Cols
            System.out.println(" ");
        }
    }
}
