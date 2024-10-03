package Recursion;

import java.util.ArrayList;

public class Palindrome_partitions {
    public static void main(String[] args) {
        String str = "NITIN";

        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        parts(str,list,ans);
        System.out.println(ans);
    }
    public  static void parts(String str, ArrayList<String> list, ArrayList<ArrayList<String>> ans){
        if(str.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=1;i<=str.length();i++){
            String s = str.substring(0,i);
            if(isSafe(s)){
                list.add(s);
                parts(str.substring(i),list,ans);
                list.remove(list.size()-1);
            }

        }
    }
    public static boolean isSafe(String str){
        int i=0;
        int j =str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
