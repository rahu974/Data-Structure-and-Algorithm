package Trees;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class test {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
    }


    public int detect() {
        if (head == null || head.next == null) {
            return -1;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            int count = 0;

            if (slow == fast) {
                Node point = head;

                while (point != slow) {
                    point = point.next;
                    slow = slow.next;
                    count++;
                }
                return count;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        test t = new test();
        t.addLast(1);
//        t.addLast(2);
//        t.addLast(0);
//        t.addLast(-4);

//        t.head.next = t.head;


        int res = t.detect();
        System.out.println("Tail connects to node index " + res);


    }

}
