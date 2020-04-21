/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task02;

/**
 *
 * @author DOLPHIN-PC
 */
public class Main {

    public static void main(String[] args) {
        int X = 1069 % 35;
        int[] cir = {X + 7, X + 8, 0, 0, 0, X + 1, X + 2, X + 3, X + 4, X + 5, X + 6};
//        int[] cir = {7, 8, 0, 0, 0, 1, 2, 3, 4, 5, 6};
        Main.printEvenBackward(cir, 5, 8);
    }

    public static void printEvenBackward(int []cir, int st, int sz) {
        for (int i = sz - 1; i >= 0; i--) {
            int k = cir[(st + i) % cir.length] ;
            if (k % 2 == 0) {
                System.out.print(k + " ") ;
            }
        }
        System.out.println();
    }
}
