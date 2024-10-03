package LL;

public class MergeSort {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static Node getMid(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2){
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
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.printLL();
        ll.head = ll.mergeSort(ll.head);
        ll.printLL();

    }
}

