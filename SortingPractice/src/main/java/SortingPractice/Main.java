/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingPractice;

/**
 *
 * @author DOLPHIN-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {2, 5, 4, 7, 9, 6, 8, 3, 1, 7, 8, 4, 5, 6};
        int[] b = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        printArray(a);
        bubbleSort(a);
        selectionSort(a);
        insertionSort(a);

    }

    public static void printArray(int[] source) {
        System.out.println("\nprintArray");
        for (int i = 0; i < source.length; ++i) {
            System.out.print(source[i] + " ");
        }
    }

    public static int[] copyArray(int[] src) {
        int[] copied = new int[src.length];
        for (int i = 0; i < src.length; ++i) {
            copied[i] = src[i];
        }
        return copied;
    }

    public static void bubbleSort(int[] src) {
        int[] sorted = copyArray(src);
        for (int i = 0; i < sorted.length; ++i) {
            for (int j = i + 1; j < src.length; ++j) {
                if (sorted[i] < sorted[j]) {
                } else {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }

            }
        }
        System.out.print("\nbubbleSort");
        printArray(sorted);

    }

    public static void selectionSort(int[] src) {
        int[] sorted = copyArray(src);
        for (int i = 0; i < sorted.length - 1; ++i) {
            int min_idx = i;
            for (int j = i + 1; j < sorted.length; ++j) {
                if (sorted[j] < sorted[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = sorted[min_idx];
            sorted[min_idx] = sorted[i];
            sorted[i] = temp;
        }
        System.out.print("\nselectionSort");
        printArray(sorted);
    }

    public static void insertionSort(int src[]) {
        int[] sorted = copyArray(src);
        for (int i = 1; i < sorted.length; ++i) {
            int pointer = sorted[i];
            int j = i - 1;
            while (j >= 0 && sorted[j] > pointer) {
                sorted[j + 1] = sorted[j];
                j = j - 1;
            }
            sorted[j + 1] = pointer;
        }
        System.out.print("\ninsertionSort");
        printArray(sorted);
    }

//    public static void countingSort(int[] src){
//        
//    
//    }
}
