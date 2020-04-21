/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09_Recursion;

/**
 *
 * @author DOLPHIN-PC
 */
public class Recursion {

    int i;

    public void print(int i) {
        if (i > 5) {
            return;
        }
        System.out.print(i + " ");
        print(++i);
        System.out.print(i + " ");
    }

    public int fact(int i) {
        if (i <= 1) {
            return 1;
        }
        return fact( i - 1) * i;

    }

    public int fib(int i) {
        if (i <= 1) {
            return i;
        }

        return fib(i - 1) + fib(i - 2);

    }

    public void printArray(int[] a, int c) {
        if (c < a.length) {
            System.out.print(a[c] + " ");
//            c++;
            printArray(a, ++c);
        }
    }

    public String decToBin(int n) {
        if (n == 0) {
            return "0";
        }
        return (n % 2) + "" + decToBin(n / 2);
    }

    public int power(int m, int n) {
        if (n == 1) {
            return m;
        }
        if (n == 0) {
            return 1; //one
        }
//        n--; 
        return m * power(m, --n);
    }

    public static int List(Node n) {
        if (n == null) {
            return 0;
        }
        return n.element + List(n.next);
    }

    public void revPrint(Node h) {
//        int x = 0;
        if (h != null) {
            revPrint(h.next);
            System.out.print(h.element + " "); 
        }
//        x = h.element;
//        System.out.print(x);
//        if(h.next == null) System.out.println(h.element);
//            revPrint(h.next);
//            System.out.print(h.element + " ");
//        }
    }

}
