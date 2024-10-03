package Stack;

import java.util.*;

public class StackReverse {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        revStack(s);
        pushAtBottom(s,top);

    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        revStack(stk);
        while(!stk.empty()){
            System.out.println(stk.pop());
        }
    }

}
