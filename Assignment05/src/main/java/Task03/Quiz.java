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
public class Quiz {

    public static void main(String[] args) {
        int X = 1069 % 37; 
        LinkedList ll = new LinkedList();
        ll.insert(X + 100);
        ll.printList();

        ll.insert(X + 70);
        ll.printList();

        ll.remove();
        ll.printList();

        ll.insert(X + 58);
        ll.printList();

        ll.insert(X + 79);
        ll.printList();

        ll.remove();
        ll.printList();

        ll.insert(X + 21);
        ll.printList();

        ll.insert(X + 11);
        ll.printList();

    }
}
