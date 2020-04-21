/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task05;

/**
 *
 * @author DOLPHIN-PC
 */
public class Tester {

    public static void main(String[] args) {
        
        int X = 1069 % 37; //33
        int a[] = {X + 1, X + 2, X + 3, X + 4};
        int b[] = {X + 5, X + 6, X + 7, X + 8};
        MyList m = new MyList();
        m.myMethod(a, b);
        m.printList();
    }
}
