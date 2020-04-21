/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment04;

/**
 *
 * @author DOLPHIN-PC
 */
public class LinkedList {

    public Node head;

    public LinkedList(Object[] a) {
        head = new Node("Dummy", null, null);
        Node cur = head;
        for (int i = 0; i < a.length; ++i) {
            Node temp = new Node(a[i], null, null);
            cur.next = temp;
            cur.prev = head;
            cur = cur.next;
        }
    }

    public LinkedList(Node h) {
        head = h;
    }

    public void printList() {
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }

    public int countNode() {
        int c = 0;
        for (Node n = head; n != null; n = n.next) {
            c++;
        }
        return c;
    }

    public Object get(int idx) {
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {

                return cur.element;
            }
            c++;
        }
        return null;
    }

    public void set(int idx, Object elem) {
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {
                cur.element = elem;
            }
            c++;
        }
    }

    public Object Search(int idx) {
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {

                return cur.element;
            }
            c++;
        }
        return null;
    }

    public Node nodeAt(int idx) {
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {

                return cur;
            }
            c++;
        }
        return null;
    }

    public void insert(Object elem, int idx) {
        if (idx < 0 || idx > countNode()) {
            System.out.println("Invalid Index");
        } else {
            Node newNode = new Node(elem, null, null);
            if (idx == 0) {
                newNode.next = head;
                newNode.prev = null;
                head = newNode;
            } else {
                Node prev = nodeAt(idx - 1);
                newNode.next = prev.next;
                newNode.prev = prev;
                prev.next = newNode;
            }

        }
    }

    public void remove(int index) {
        if (countNode() == index) {
            Node prev = nodeAt(index - 2);
            prev.next = null ;
        } else {

            Node prev = nodeAt(index - 1);
            prev.next = prev.next.next;
            prev.next.next.prev = prev;
        }
    }

//    public Object remove(int index){
//    Node temp = head;
//    Node y = null;
//    Node x = null;
//    Node z = null;
//    int c = countNode();
//    if(index<0 || index>c){
//    }
//    else if (index == c){
//      temp = temp.next ;
//      y = temp.prev ;
//      x = temp.next ;
//      x.next = null ;  
//    }
//    else{
//      for(int i = 0 ; i<index ; i++){
//        temp = temp.next;
//      }
//      y = temp;
//      x = temp.prev;
//      z = temp.next;
//      x.next = z;
//      z.prev = x;
//    }
//    return y.element;
//  }
    
    
 public Node reverse() {
        Node Dummy = new Node(head.element, null , null) ;
        Node reverseNode = new Node(head.next.element, null, null);
        for (Node cur = head.next.next; cur != null; cur = cur.next) {
            Node Temp = new Node(cur.element, reverseNode , null );
//            Temp.next = null ; 
            Temp.prev = reverseNode ; 
            reverseNode = Temp  ;
        }
        Dummy.next = reverseNode ;
        reverseNode.prev = Dummy ;
        return Dummy ; 
    }   
}
