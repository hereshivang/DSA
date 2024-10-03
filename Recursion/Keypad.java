import java.util.List;

import java.util.*;
public class Keypad {
    static String[] key = {"", "abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        String str = "12";
        printKeys(str,"",list);
        print(list);
    }
    public static void printKeys(String str, String ans, List<String> list){
        if(str.length()==0){
            list.add(ans);
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        //Integer Value Accessing
        String pressStr = key[ch-48];
        for(int i=0;i<pressStr.length();i++){
            printKeys(str.substring(1),ans + pressStr.charAt(i),list);
        }
    }
    public static void print(List<String> list){
        for(String ch : list){
            System.out.println(ch);
        }
    }
}
