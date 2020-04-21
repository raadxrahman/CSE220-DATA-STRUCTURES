package Lab09_Recursion;

public class LinkedList {

    public Node head;

    public LinkedList(int[] a) {
        head = new Node(a[0], null);
        Node cur = head;
        for (int i = 1; i < a.length; ++i) {
            Node temp = new Node(a[i], null);
            cur.next = temp;
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
        System.out.println(69%5);
        if (idx < 0 || idx >= countNode()) {
            return null;
        }
        Node cur = head;
        for (int i = 0; i < idx; ++i) {
            cur = cur.next;
        }
        return cur.element;
    }

    public Object set(int idx, Object elem) {
        if (idx < 0 || idx >= countNode()) {
            return null;
        }
        int c = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (c == idx) {
                int Old = cur.element;
                cur.element = (int) elem;
                return Old;
            }
            c++;
        }
        return null;
    }

    public Node nodeAt(int idx) {
        int x = countNode();
        if (idx < 0 || idx >= x) {
            return null;
        }
        Node cur = head;
        for (int i = 0; i < idx; ++i) {
            cur = cur.next;
            return cur;
        }
        return null;
    }

    public Node searchNode(int idx) {
        if (idx < 0 || idx >= countNode()) { 
            return null;
        }
        int c = 0 ;
        Node cur = head;
        for (; cur != null; cur = cur.next) {
            if (c == idx) {
                break;
            }
            c++;
        }
        return cur;
    }

    public void insert(Object elem, int idx) {
        if (idx < 0 || idx > countNode()) {
            System.out.println("Invalid Index");
        } else {
            Node newNode = new Node((int) elem, null);
            if (idx == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node prev = searchNode(idx - 1);
                newNode.next = prev.next;
                prev.next = newNode;
            }
        }
    }

    public Object remove(int idx) {
        if (idx < 0 || idx >= countNode()) {
            return null;
        } else {
            Node removeNode;
            if (idx == 0) {
                removeNode = head;
                head = head.next;
            } else {

                Node prev = nodeAt(idx - 1);
                removeNode = prev.next;
                prev.next = removeNode.next;
            }
            return removeNode.element;
        }
    }

    public Node reverseList() {
        Node reverseNode = new Node(head.element, null);
        for (Node cur = head.next; cur != null; cur = cur.next) {
            Node Temp = new Node(cur.element, reverseNode);
            reverseNode = Temp;
        }
        return reverseNode;
    }

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
