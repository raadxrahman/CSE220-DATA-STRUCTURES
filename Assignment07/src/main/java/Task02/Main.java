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
        int x = 1;
//        int sum = 0 ;
        System.out.println(recursiveSummation(x, 0, 0));
    }

    public static int recursiveSummation(int x, int c, int sum) { //only positive numbers
        if (c > 9) {
            return sum;
        }
        if (x % 2 == 0) {
            sum = sum + x;
            x++;
            c++;
            return recursiveSummation(x, c, sum);
        } else {
            x++;
            return recursiveSummation(x, c, sum);
        }
    }
}
