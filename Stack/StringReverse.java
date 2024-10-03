package Stack;

import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();
        String str = "hello";
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            stk.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            char ch = stk.pop();
            newStr = newStr.append(ch);
        }
        System.out.println(newStr);
    }
}
