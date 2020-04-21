package Lab05_List_Problems;

public class ZigZag {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int size = a.length+b.length;
        int[] c = new int[size];
        int k =0;
        for (int i = 0; i < c.length; i+=2) {
            c[i] = a[k];
            c[i+1] = b[k];
            k++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
