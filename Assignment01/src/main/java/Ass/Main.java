package Ass;

public class Main extends Assignment01 {

    public static void main(String[] args) {
        int[] a = {10,32,28,42,23,32,26,37};
        int[] b = copyArray(a);
        System.out.println("copyArray");
        printArray(b);
        System.out.println("printArray");
        printArray(b);
        System.out.println("resizeArray");
        b = copyArray(b);
        resizeArray(b, 12);
        printArray(b);
        System.out.println("reverseArray");
        reverseArray(b);
        printArray(b);
        System.out.println("shiftLeft");
        b = copyArray(a);
        shiftLeft(b, 3);
        printArray(b);
        System.out.println("shiftRight");
        b = copyArray(a);
        shiftRight(b, 3);
        printArray(b);
        System.out.println("Insertion");
        b = copyArray(a);
        boolean bol = insertElement(b, 555, 8);
        System.out.println(bol);
        printArray(b);
        System.out.println("Removal");
        b = copyArray(a);
        removeElement(b, 50);
        printArray(b);
        System.out.println("rotateLeft");
        b = copyArray(a);
        b = rotateLeft(b, 4);
        printArray(b);
        System.out.println("rotateRight");
        b = copyArray(a); 
        b = rotateRight(b, 4);
        printArray(b);
    }
}
