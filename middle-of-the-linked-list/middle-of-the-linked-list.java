/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}



class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = next;
    }
}

 class SinglyLinkedList {
    Node head;
   

    public SinglyLinkedList() {
        this.head = null;
       
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next!=null) {
                lastNode = lastNode.next;
            }
            lastNode.next=newNode;
        }
    }

    public void insertAthead(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            //2->3->null
            //Insert At head 1
            //newNode = 1
            //currenthead = 2
            //newNode.next = 2
            //head = newnode


            newNode.next = head;
            head = newNode;

        }

    }


    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insert(5);
        linkedList.insert(4);

        linkedList.print();
        linkedList.insertAthead(6);
        linkedList.print();
    }
}
