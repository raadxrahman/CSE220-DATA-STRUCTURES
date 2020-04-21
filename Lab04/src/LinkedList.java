
public class LinkedList {

    public Node head;

    /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {
        head = new Node(a[0], null);
        Node cur = head;
        for (int i = 1; i < a.length; ++i) {
            Node temp = new Node(a[i], null);
            cur.next = temp;
            cur = cur.next;
        }
    }

    /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
     */
    public LinkedList(Node h) {
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        int c = 0;
        for (Node n = head; n != null; n = n.next) {
            c++;
        }
        return c;
    }

    /* prints the elements in the list */
    public void printList() {
        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
//        if (idx < 0 || idx >= countNode()) {
//            return null;
//        }
//        Node cur = head;
//        for (int i = 0; i < idx; ++i) {
//            cur = cur.next;
//            return cur;
//        }
//        return null;
        
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {

                return cur;
            }
            c++;
        }
        return null;
    }

// returns the element of the Node at the given index. For invalid idx return null. Both Solutions work
    public Object get(int idx) {
//        if (idx < 0 || idx >= countNode()) {
//            return null;
//        }
//        Node cur = head;
//        for (int i = 0; i < idx; ++i) {
//            cur = cur.next;
//        }
//        return cur.element;
//    }

        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {

                return cur.element;
            }
            c++;
        }
        return null;
    }

    /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {
                Object Temp = cur.element ;
                cur.element = elem;
                return Temp;
            }
            c++;
        }
        return null;

//      if (idx < 0 || idx >= countNode()) {
//            return null;
//        }
//        int c = 0;
//        for (Node now = head; now != null; now = now.next) {
//            if (c == idx) {
//                Object Old = now.element;
//                now.element = elem;
//                return Old;
//            }
//            c++;
//        }
//        return null;    
    }


    /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.element == elem) {
                return c;
            }
            c++;
        }
        return -100;
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.element == elem) {
                return true;
            }
        }
        return false;
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
        Node copyHead = new Node(null, null);
        Node copyTail = new Node(null, null);
        for (Node cur = head; cur != null; cur = cur.next) {
            if (copyHead.element == null) {
                copyHead.element = cur.element;
                copyHead.next = copyTail;
                copyTail = copyHead;
            } else {
                copyTail.next = new Node(cur.element, null);
                copyTail = copyTail.next;
            }
        }
        return copyHead; // please remove this line!
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        Node reverseNode = new Node(head.element, null);
        for (Node cur = head.next; cur != null; cur = cur.next) {
            Node Temp = new Node(cur.element, reverseNode);
            reverseNode = Temp;
        }
        return reverseNode; // Return Reverse Node
    }

    /* inserts Node containing the given element at the given index
   * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        if (idx < 0 || idx > countNode()) {
            System.out.println("Invalid Index");
        } else {
            Node newNode = new Node(elem, null);
            if (idx == 0) {
                newNode.next = head;
                head = newNode;
            } else {
//                Node prev = nodeAt(idx - 1);
//                Node forw = nodeAt (idx) ;
//                newNode.next = forw ; 
//                prev.next = newNode;
                
                Node prev = nodeAt(idx - 1);
                newNode.next = prev.next;
                prev.next = newNode;
            }
            
        }
    }

    /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        if (index < 0 || index >= countNode()) {
            return null;
        } else {
            Node removedNode;
            if (index == 0) {
                removedNode = head;
                head = head.next;
            } else {

                Node prev = nodeAt(index - 1);
                removedNode = prev.next;
                prev.next = removedNode.next;
            }
            return removedNode.element; // Return Removed Node
        }
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        Node temp = head.next;
        cur.next = head;
        head.next = null;
        head = temp;
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        Node cur = head;
        Node tail = null;
        for (; cur.next != null; cur = cur.next) {
            if ((cur.next).next == null) {
                tail = cur;
            }

        }
        Node temp = head;
        cur.next = temp;
        head = cur;
        tail.next = null;
    }

}
