package LL;
import java.util.*;
public class LL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add Elements from First
    public void addFirst(int data){
        // 1. Create a new node
        Node newNode = new Node(data);
        // Edge Case
        if(head == null){
            head = tail = newNode;
            return;
        }

        // 2. newNode.next -> Head
        newNode.next = head;

        // 3. Head -> newNode
        head = newNode;
        size++;
    }

    // Add Elements from Last
    public void addLast(int data){
        // 1. Create a new Node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = null;
            return;
        }

        // 2. newNode.next --> null
        tail.next = null;

        // 3. Tail = newNode
        tail = newNode;
        size++;
    }

    public void addMid(int idx, int data){
        // Edge Case
        if(idx == 0){
            addFirst(data);
            return;
        }

        // 1. Create a new Node
        Node newNode = new Node(data);
        size++;

        // 2. Find Right Index
        Node temp = head;
        int i = 0;
        while(i<=idx){
            temp = temp.next;
            i++;
        }

        // 3. Insert data
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void remFirst(){
        // Edge Cases
        if(size == 0){
            System.out.println("Nothing to Delete");
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }

        // Removing Elements
        head = head.next;
    }

    public void remLast(){
        // Edge Cases
        if(size == 0){
            System.out.println("Empty LL");
        }else if(size == 1){
            head = tail = null;
            size = 0;
        }

        // 1. Find Last Node
        Node prev = head;
        for(int i=0;i<size-1;i++){
            prev = prev.next;
        }

        // 2. Removing Last Node
        prev.next = null;
        tail = prev;
        size--;


    }

    public int itsSearch(int key){
        Node temp = head;
        int i =0;
        while(temp!=null){
            if(key == temp.data){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;

    }

    public int recSearc(int key){
        return  helper(head,key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = null;
    }

    public void NNode(int n){
        // 1. Calculate Size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        // 2. Edge Case
        if(n == sz){
            head = head.next;
        }

        // 3. Find and Delete Nth Node
        int i = 0;
        int prevNode = sz-n;
        Node prev = head;
        while(i<prevNode){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // Printing the LL
    public void printLL(){
        // Edge Case
        if(head == null){
            return;
        }

        // 1. Create a temp Node
        Node temp = head;

        // 2. Loop over Temp Node
        while(temp!= null){
            System.out.println(temp.data+"-->");
            temp.next = temp;
        }
        System.out.println("NULL");
    }



    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Methods
        list.addLast(3);
        list.addLast(5);
        list.addFirst(2);
        list.addFirst(1);
        list.addMid(3,4);
        list.addMid(0,0);

        list.printLL();
        // System.out.println(ll.size + 1);

        list.remFirst();
        list.remLast();
        list.printLL();
       // System.out.println(list.itsSearch(2));
       // System.out.println(list.recSearch(2));
        // list.reverse();
        list.printLL();
        list.NNode(3);
        list.printLL();
    }
}
