/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task03;

/**
 *
 * @author DOLPHIN-PC
 */
public class Fibonacci {
    public static void main(String args[]) {
//        int n = ((1069%3) +(1069%2)); // X={(last 4 digit of your id%3)+ (last 3 digit of your id%4)+2} System.out.println(fib(n));
//        System.out.println(n);
        int n = 6 ;
        System.out.println(fib(n));
    }
    
    public static int fib(int n){
        if(n <= 1) return n ;
        return fib(n-1)+fib(n-2) ; 
    }
}
