package Task02ListQueue;
/**
 *
 * @author Mujtahid Akon
 */
public class ListQueue implements Queue {

    private Node head, tail;
//    private int capacity;
    //int rear = -1 ; //rear = (start+ size)%data.length; = (0+0)
    private int size;

    public ListQueue() {
//        this.capacity = capacity;
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
//        int size = 0;
//        for (Node n = head; n != null; n = n.next) {
//            size++;
//        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(Object e) throws QueueOverflowException {
//        if (size == 0) {
//            throw new QueueOverflowException();
//        }
        if (size == 0) {
            head = new Node(e, null);
            tail = head;
        } else {
            Node n = new Node(e, null);
            tail.next = n;
            tail = n;
        }
        size++;
    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException();
        }
        Object removed = head.val;
        head = head.next;
        size--;
        return removed;
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        if (size == 0) {
            return null;
        }
        return head.val;

    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Empty Queue";
        }
        String s = "[ ";
        for (Node temp = head; temp != null; temp = temp.next) {
            s = s + temp.val + " ";
        }
        s = s + "]";
        return s;
    }

    @Override
    public Object[] toArray() {
        Object[] a1 = new Object[size];
        int j = 0;
        for (Node n = head; n != null; n = n.next) {
            a1[j] = n.val;
            j++;
        }
        return a1;
    }

    @Override
    public int search(Object e) {
        int c = 0;
        for (Node n = head; n != null; n = n.next) {
            if (n.val == e) {
                return c;
            }
            c++;
        }
        return -1;
    }

    public void linearView() {
        String s = "[ ";
        for (Node n = head; n != null; n = n.next) {
            s = s + n.val + " ";
        }
        s = s + "]";
        System.out.println("view: " + s);
    }

}
