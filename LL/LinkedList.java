package LL;

public class LinkedList {
    // Node Class
    public static class Node{
        int data;
        Node next;

        // Node Constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Head & Tail of LL
    public static Node head;
    public static Node tail;
    public static int size;

    // LL Methods
    public void addFirst(int data){
        // TC = O(1)
        // 1. Create New Node
        Node newNode = new Node(data);
        // NUll Node
        if(head == null){
            head = tail = newNode;
            return;
        }

        // 2. NewNode.next --> Head
        newNode.next = head;

        // 3. Head ---> newNode
        head = newNode;
        size++;
    }

    public void addLast(int data){
        // 1. Create a newNode
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        // 2. prev(Next.next) ---> newNode
        tail.next = newNode;

        // 3. newNode.next ---> null
        tail = newNode;
        size++;
    }

    public void addMid(int idx ,int data){
        // TC = O(n)
        if(idx == 0){
            addFirst(data);
            return;
        }

        // add(index , data)
        // 1. Create newNode
        Node newNode = new Node(data);
        size++;

        // 2. temp node
        Node temp = head;
        int i = 0;
        // 3. Loop for idx-1;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void remFirst(){
        if(size == 0){
            System.out.println("Nothing to Delete");
        }
        else if(size == 1){
            head = tail = null;
            size = 0;
        }
        head = head.next;
        size--;
    }

    public void remLast(){
       if(size == 0){
           System.out.println("Empty LL");
       }else if(size == 1){
           head = tail = null;
           size = 0;
       }

       //prev = idx - 2

       Node prev = head;
       for(int i=0;i<size-1;i++){
           prev = prev.next;
       }

       prev.next = null;
       tail = prev;
        size--;
    }

    public int itsSearch(int key){
        Node temp = head;
        int i = 0;

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
        if(head.data == key)    return 0;

        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void NNode(int n){
        // Node from Start = size-n+1;
        int sz = 0;
        Node temp = head;
        while(temp!= null){
            temp = head.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }

        int i=1;
        int find = sz-n;
        Node prev = head;
        while(i<find){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static Node getMid(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = temp.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = temp.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            head1 = temp.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2 = temp.next;
            temp = temp.next;
        }
        return mergeLL.next;

    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // 1. Find Middle Element
       Node mid = getMid();

        // 2. Left & Right Half
       Node rightHead = mid.next;
        mid.next =  null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // 3. Merge
        return merge(newLeft, newRight);
    }
    public void printLL(){
        // 1. Temp Node
        if(head == null) {
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();;
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMid(2,3);
        // ll.printLL();

        // ll.remFirst();
        // ll.printLL();

        // ll.remLast();
        // ll.printLL();

        // System.out.println(ll.itsSearch(4)); //TC = O(n)
        // System.out.println(ll.recSearch(4)); //TC = O(n)

        // ll.reverse();
        // ll.printLL();
        ll.NNode(3);
        ll.printLL();

        ll.head = ll.mergeSort(ll.head);
    }
}
