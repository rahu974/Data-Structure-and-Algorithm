package Linked_List.Theory_Doubly_Syntax;

//Doubly Linked List Insertion from beginning and end.

//TC for addFirst is O(1).
//TC for addLast is O(n).
public class Double {
    Node head, tail;

    class Node {
        int data;
        Node prev, next;

        Node(int new_data) {
            this.data = new_data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addLast(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = tail = new_node;
            head.prev = null;
            tail.next = null;
        }
        Node curr = tail;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new_node;
        new_node.next = null;
    }

    public void addFirst(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "<->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Double d1 = new Double();
        d1.addLast(1);
        d1.addLast(2);
        d1.addLast(3);
        d1.addLast(4);
        d1.addLast(5);
        d1.display();
    }
}
