/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task01;

/**
 *
 * @author DOLPHIN-PC
 */
public class Main {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println("iterativeSearch " + iterativeSearch(a, 60));
        System.out.println("recursiveSearch " + recursiveSearch(a, 0, a.length - 1, 60));
    }

    public static int iterativeSearch(int[] x, int target) {
        int size = x.length;
        int front = 0;
        int back = size - 1;
        while (front <= back) {
            int mid = (front + back) / 2;
//            System.out.println(mid);
            if (x[mid] == target) {
                return mid;
            } else if (x[mid] < target) {
                front = mid + 1;
            } else {
                back = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveSearch(int[] a, int front, int back, int target) {
        while (front <= back) {
            int mid = (front + back) / 2;
            if (target == a[mid]) {
                return mid;
            } else if (target > a[mid]) {
                return recursiveSearch(a, mid + 1, back, target);
            } else {
                return recursiveSearch(a, front, mid - 1, target);
            }
        }
        return -1;
    }
}
