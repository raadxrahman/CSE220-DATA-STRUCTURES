/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task07;

import java.util.Scanner;

/**
 *
 * @author DOLPHIN-PC
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.next();
        System.out.println(s.length());
        mystery4(s);
    }

    public static void mystery4(String s) {
        if (s.length() > 0) {
            System.out.print(s.charAt(0));
            if (s.length() % 2 == 0) {
//                System.out.println("=subss= " +(s.substring(0, s.length()-1)));
                mystery4(s.substring(0, s.length()-1));
            } else {
                System.out.println("**");
                System.out.println("#" + s.length() + s.length() + "*");
//                System.out.println(" --- " + s.substring(1, s.length()));
                mystery4(s.substring(1, s.length()));
                System.out.print(s.charAt(s.length() - 1));
            }
        }
    }
}
