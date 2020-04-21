
public class ArrayStack implements Stack {

    int size;
    Object[] data;
    private static final int DEFINED_INIT_SIZE = 5;

    public ArrayStack() {
        size = 0;
        data = new Object[DEFINED_INIT_SIZE];
    }

    @Override
    public int size() {
//        int size = 0;
////        int j = 0 ;
//        for (int i = 0; i < data.length; ++i) {
//            if (data[i] != null){
//            size++  ;
////            j++ ; 
//        } 
//            
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
    public void push(Object e) throws StackOverflowException {
        if (size == data.length) {
            throw new StackOverflowException();
        } else {
            data[size] = e;
            size++;
        }
    }

    @Override
    public Object pop() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException();
        } else {
            Object temp = data[size - 1];
//      data[size-1] = null;
            size--;
            return temp;
        }
    }

    @Override
    public Object peek() throws StackUnderflowException {
        if (size == 0) {
            throw new StackUnderflowException();
        }
        return data[size - 1];
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "Stack empty";
        }
        String s = "[ ";
        for (int i = size - 1; i >= 0; i--) {
            s = s + data[i] + " ";
        }
        s = s + " ]";
        return s;
    }

    @Override
    public Object[] toArray() {
        Object[] a1 = new Object[size];
        int j = 0;
        for (int i = size - 1; i >= 0; i--) {
            a1[j] = data[i];
            j++;
        }
        return a1;
    }

    @Override
    public int search(Object e){
    int c = 0;
    for(int i = size-1 ; i>=0 ; i--){
      if(data[i]==e) return c;
      c++;
    }
    return -1;
  } 
}

