/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task02;

/**
 *
 * @author DOLPHIN-PC
 */
public class Task02 {
    
    Node head;

    Task02(int[] arr) {
        head = new Node(arr[0], null); // Create Head NodeN for LinkList
        Node cur = head;
        for (int i = 1; i < arr.length; i++) {
            Node Temp = new Node(arr[i], null); // Create new NodeN for LinkList
            cur.next = Temp; // Take Previouse NodeN Refarence
            cur = cur.next;
        }
    }

    /* prints the elements in the list */
   public void printList() {
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }

    //sortList() will sort NodeNs of the list in ascending order  
    public void sortList() {  
        //NodeN current will point to head  
        Node cur = head, idx = null;  
        int temp;  

        if(head == null) {  
            return;  
        }  
        else {  
            while(cur != null) {  
                //NodeN index will point to NodeN next to current  
                idx = cur.next;  

                while(idx != null) {  
                    //If current NodeN's data is greater than index's NodeN data, swap the data between them  
                    if(cur.element >idx.element) {  
                        temp = cur.element;  
                        cur.element = idx.element;  
                        idx.element = temp;  
                    }  
                    idx = idx.next;  
                }  
                cur = cur.next;  
            }      
        }  
    }  

    public void RemoveDuplicates() {
        Node cur = head;
        while (cur != null) {
            Node temp = cur;
            while (temp != null && temp.element == cur.element) {
                temp = temp.next;
            }
            cur.next = temp;
            cur = cur.next;
        }
    }
    
}
