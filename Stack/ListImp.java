package Stack;
import java.util.ArrayList;
public class ListImp {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        // Check Emptiness
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        // Push
        public static void push(int data){

            list.add(data); // at last index
        }
        // POP
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
           int top = list.get(list.size() -1);
           list.remove(list.size()-1);
           return top;
        }
        // Peek
        public static int seek() {
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            return top;

        }
        // printing Stack
        public static void print(){
            while(!isEmpty()){
                System.out.println(seek());
                pop();
            }
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
         s.print(); // It empty the stack
        // System.out.println(s.isEmpty());
         s.pop();
        // s.print();
        System.out.println(s.seek());
    }
}
