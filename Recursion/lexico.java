package Recursion;

public class lexico {
    public static void printCount(int curr,int end){

        if(curr > end){
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr == 0){
            i = 1;
        }
        for(;i<=9;i++){
            printCount(curr*10+i,end);
        }
    }
    public static void main(String[] args) {
        int n = 1000;
        printCount(0,n);
    }
}
