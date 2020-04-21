/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task04;

/**
 *
 * @author DOLPHIN-PC
 */
public class Factorial {
    public static void main(String[] args) {
//        int num = ((1069%3) +(1069%4) + 2); // X={(last 4 digit of your id%3)+ (last 3 digit of your id%4)+2}
        int num = 3 ; 
//        System.out.println("Factorial of " + num + " is " + factorial(num));
        System.out.println(factorial(num));
    }
    
    public static int factorial(int f) {
        if(f<=1) return 1 ;
        return f * factorial(f-1) ;
        
    }
}
