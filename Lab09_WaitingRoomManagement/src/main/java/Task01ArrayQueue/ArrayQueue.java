package Task01ArrayQueue;
/**
 *
 * @author Mujtahid Akon
 */
public class ArrayQueue implements Queue {

    Object[] data;
    int front;
    int size;

    public ArrayQueue() {
        data = new Object[100];
        size = 0;
        front = 0;
    }

    @Override
    public int size() {
//        int size = 0;
//        for (int i = front; i < front + size; ++i) {
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
        if (size == data.length) {
            throw new QueueOverflowException();
        }
        int newR = (front + size) % data.length;
        data[newR] = e;
        size++;
    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException();
        }
        Object removed = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException();
        }
        return data[front];
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Empty Queue";
        }
        String s = "[ ";
        int j = front;
        for (int i = 0; i < size; i++) {
            s = s + data[j] + " ";
            j = (j + 1) % data.length;
        }
        s = s + "]";
        return s;
    }

    @Override
    public Object[] toArray() {
        Object[] a1 = new Object[size];
        int j = front;
        for (int i = 0; i < size ; ++i) {
            a1[i] = data[j];
            j = (j+1)% data.length ;
        }
        return a1;
    }

    @Override
    public int search(Object e) {
        int c = 0 ;
        for (int i = 0; i < data.length ; ++i) {
            if (data[i] == e) {
                return c;
            }
            c++ ;
        }
        return -1;
    }

    // print linear array view of the internal circular array
    public void linearView() {
        String s = "";
        for (int i = 0; i < data.length; i++) {
            s = s + data[i] + " ";
        }
        s = s;
        System.out.println("view: " + s);
    }

}
