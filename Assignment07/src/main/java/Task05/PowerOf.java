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
public class PowerOf {

    public static void main(String[] args) {
        int x = (1069 % 5) + 2;
        int y = (1069 % 3) + 1;
        System.out.println(x + "," + y) ;
        System.out.printf("%d", power(x, y));
    }

    public static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            System.out.println("x");
            return power(x, y / 2) * power(x, y / 2);
            
        } else {
            return x * power(x, y / 2) * power(x, y / 2);
        }

    }
}
