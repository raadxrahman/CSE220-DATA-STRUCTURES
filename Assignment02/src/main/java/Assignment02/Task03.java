package Assignment02;
import java.util.*;
public class Task03 {
    private int start;
    private int size;
    private Object[] cir;
    Random random = new Random();
    
    public Task03(Object[] a, int st, int sz) {
        start = st;
        size = sz;
        cir = new Object[a.length];
        for (int i = 0; i < size; i++) {
            cir[(start + i) % a.length] = a[i];
        }
    }
    
     public void printArray() {
        for (int i = 0; i <= cir.length - 1; i++) {
            if (i == cir.length - 1) {
                System.out.print(cir[i] + "\n\n");
            } else {
                System.out.print(cir[i] + ", ");
            }
        }
    }
     
     public void printForward() {
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(cir[(start + i) % cir.length]);
            } else {
                System.out.print(cir[(start + i) % cir.length] + ", ");
            }
        }
        System.out.println();
    }
     
     public void printBackward(){
         for (int i = size - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(cir[(start + i) % cir.length]);
            } else {
                System.out.print(cir[(start + i) % cir.length] + ", ");
            }
        }
        System.out.println();
     }
     
     public void linearize() {
        Object[] T = new Object[size];
        for (int i = 0; i < size; i++) {
            T[i] = cir[(start + i) % cir.length];
        }
        cir = T;
    }
     
     public void resize(int length) {
        Object[] T = new Object[length];
        for (int i = 0; i < size; i++) {
            T[i] = cir[(start + i) % cir.length];
        }
        cir = T;
        for (int i = size ; i < T.length ; ++i){
            if(T[i] == null){
                T[i] = random.nextInt(44);
            }
        }
    }
     
      public void insert(Object elem, int pos) {
        if (size == cir.length) {
            resize(size + 3);
        }
//        int index = (start + pos) % cir.length;
//        for (int i = size; i > pos; i--) {
//            cir[(start + i) % cir.length] = cir[(start + i - 1) % cir.length];
//        }
//        cir[index] = elem;
    
        int index = (start + pos) % cir.length;
        for (int i = 0; i < size - pos; i++) {
            cir[(start + i - 1) % cir.length] = cir[(start + i) % cir.length];
        }
        cir[index] = elem;
        size += pos;
        start--;
    }
    
      
      public void remove(int pos) {
        int index = (start + pos) % cir.length;
        for (int k = 0; k < size - pos; k++) {
            cir[index] = cir[(index + 1) % cir.length];
            index++;
            if (index >= cir.length) {
                index = index % cir.length;
            }
        }
    }
    
}
