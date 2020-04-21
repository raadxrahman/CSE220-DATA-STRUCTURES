/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task06;

import java.util.Scanner;

/**
 *
 * @author DOLPHIN-PC
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(mystery3(n));
    }

    public static int mystery3(int n) {
        if (n < 0) {
            return -mystery3(-n);
        } else if (n < 10) {
            return n;
        } else {
            System.out.println("n/10 " + n/10);
            System.out.println("n%10 " + n%10);
            return mystery3(n / 10 + n % 10);
        }
    }
}
