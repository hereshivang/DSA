package Queues;

public class CirQueueArray {
    static class Queue{
        static int arr[];
        static int rear;
        static int front;
        static int size;
        Queue(int n){
            arr = new int[n];
            this.size = n;
            this.rear = -1;
            this.front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Nothing");
                return -1;
            }
            int res = arr[front];
            front = (front+1) % size;
            // last element detete
            if(rear == front){
                rear = front = -1;
            }
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Nothing");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue qq = new Queue(5);
        qq.add(1);
        qq.add(2);
        qq.add(3);
         while(!qq.isEmpty()){
             System.out.println(qq.peek());
             qq.remove();
         }

    }
}
