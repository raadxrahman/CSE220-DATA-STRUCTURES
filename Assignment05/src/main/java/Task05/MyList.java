/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task05;

/**
 *
 * @author DOLPHIN-PC
 */
public class MyList {

    public Node head;

    public void myMethod(int[] a, int[] b) {
        head = new Node(a[0] * b[0], null, null);
        Node h = head;
        Node p;
        for (int i = 0; i < a.length; i++) {
            p = new Node(a[i], null, null);
            h.next = p;
            h = h.next;
        }
        h.next = head;
        h = head;
        for (int i = 0; i < b.length; i++) {
            p = new Node(b[i]
                    - a[i], null, null);
            h.prev = p;
            h = h.prev;
        }
    }
    
     public void printList() {
        Node n = head;
        for (; n.next != head; n = n.next) {
            System.out.print(n.x + ", ");
        }
        System.out.println(n.x + ". ");
    }
}
