/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task03;

/**
 *
 * @author DOLPHIN-PC
 */
public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    void insert(int val) {
        Node node = new Node(val, null);
        node.next = head;
        head = node;
    }

    int remove() {
        int val = 0;
        if (head != null) {
            Node prev = null;
            Node cur = head;
            while (cur.next != null) {
                prev = cur;
                cur = cur.next;
            }
            val = cur.num;
            if (cur == head) {
                head = null;
            } else {
                prev.next = null;
            }
        }
        return val;
    }
    
    public void printList() {
        for (Node x = head; x != null; x = x.next) {
            System.out.print(x.num + " ");
        }
        System.out.println();
    }
}
