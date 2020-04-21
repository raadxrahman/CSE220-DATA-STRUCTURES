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
public class Tester02 {

    public static void main(String[] args) {
        int x = (69 % 25) + (69 % 30) + 2;
        int[] array = {x + 21, x + 13, x + 23, x + 21, x + 13, x + 29};
        Task02 a = new Task02(array);
        a.printList();
        System.out.println("Sort");
        a.sortList();
        a.printList();
        System.out.println("RemoveDuplicate");
        a.RemoveDuplicates();
        a.printList();
    }

}
