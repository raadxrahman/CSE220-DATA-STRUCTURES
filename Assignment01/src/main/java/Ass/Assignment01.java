package Ass;

public class Assignment01 {

    public static int[] copyArray(int[] source) {
        int[] c = new int[source.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = source[i];
        }
        return c;
    }

    public static void printArray(int[] source) {
        for (int i = 0; i < source.length; ++i) {
            if (i == source.length - 1) {
                System.out.println(source[i]);
            } else {
                System.out.print(source[i] + ",");
            }
        }
    }

    public static int[] resizeArray(int[] source, int len) {
        int[] c = new int[len];
        for (int i = 0; i < c.length; i++) {
            c[i] = source[i];
        }
        return c;
    }
//    public static Object[] resizeArray(Object[] source, int newcapacity) {
//        Object[] T = new Object[newcapacity];
//        for (int i = 0; i < source.length; i++) {
//            T[i] = source[i];
//        }
//        return T;
    
    public static void reverseArray(int[] source) {
        int i, T;
        for (i = 0; i < source.length / 2; i++) {
            T = source[i];
            source[i] = source[source.length - 1 - i];
            source[source.length - 1 - i] = T;
        }
    }

    public static int[] shiftLeft(int[] source, int k) {
        for (int i = 0; i + k < source.length; i++) {
            source[i] = source[i + k];
            source[i + k] = 0;
        }
        return source;
    }

    public static int[] shiftRight(int[] source, int k) {
        for (int i = 0; i < k; i++) {
            source[i + k] = source[i];
            source[i] = 0;
        }
        return source;
    }

    public static boolean insertElement(int[] source, int elem, int index) {
        if (index < source.length) {
            for (int i = source.length - 1; i > index; i--) {
                source[i] = source[i - 1];
            }
            source[index] = elem;
            return true;
        } else {
            System.out.println("No space Left");
            return false;
        }
    }

    public static int[] removeElement(int[] source, int elem) {
        for (int i = 0; i < source.length - 1; i++) {
            if (source[i] == elem) {
                source[i] = 0;
            }
        }
        return source;
    }

    public static int[] rotateLeft(int[] source, int k) {
        for (int i = 0; i + k < source.length; i++) {
            int T = source[i];
            source[i] = source[i + k];
            source[i + k] = T;
        }
        return source;      
    }

    public static int[] rotateRight(int[] source, int k) {
        for (int i = source.length - 1; i - k >= 0; i--) {
            int T = source[i];
            source[i] = source[i - k];
            source[i - k] = T;
        }
        return source;   
    }
    
}
