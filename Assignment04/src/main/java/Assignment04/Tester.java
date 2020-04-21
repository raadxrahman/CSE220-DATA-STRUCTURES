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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] a = {"Raad1", "Raad2", "Raad3", "Raad4", "Raad5"};
        LinkedList h = new LinkedList(a);

        System.out.println("Task02-Print");
        h.printList();
        System.out.println("Task03-Count");
        System.out.println(h.countNode());
        System.out.println("Task04-Get");
        Object val = h.get(1069 % 5);
        System.out.println(val);
        System.out.println("Task05-Set");
        h.set(1069%4, "Set"); 
        h.printList();
        System.out.println("Task06-Search");
        System.out.println("Task07-Insert");
        h.insert("InFirst", 1);
        h.printList();
        h.insert("InLast", h.countNode());
        h.printList();
        h.insert("RandomIn", 1069%4);
        h.printList();
        System.out.println("Task08-Remove");
        h.remove(2);
        h.printList();
        h.remove(h.countNode());
        h.printList();
        h.remove(1069%4);
        h.printList();
//        System.out.println(h.nodeAt(0).prev.prev.element);
        System.out.println("Task09-Reverse");
        Node rev = h.reverse(); 
        LinkedList h2 = new LinkedList(rev); 
        h2.printList();
        

    }

}
