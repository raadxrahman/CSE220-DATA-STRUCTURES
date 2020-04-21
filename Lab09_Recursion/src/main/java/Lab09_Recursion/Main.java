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
public class Main extends Recursion{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursion b = new Recursion();
        b.print(1);
        System.out.println("\nFactorial " + b.fact(3));
        System.out.println("Fibonacci " + b.fib(6));
        int[] a = {1, 2, 3};
        System.out.print("printArray ");
        b.printArray(a, 0);
        System.out.println("\nDecimal to Binary " + b.decToBin(10));
        System.out.println("PowerOf " + b.power(2, 3));
        LinkedList ll = new LinkedList(a);
        System.out.println("ListAdd " + List(ll.head));
        System.out.print("Reverse Print ");
        b.revPrint(ll.head);
    }
}
