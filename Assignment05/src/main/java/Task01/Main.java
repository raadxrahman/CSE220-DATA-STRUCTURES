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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X = 1069%40 ; 
        int [] A = {X, X+10, X-100, X+20} ;
        int [] B = {X+20, X+30, X+60, X+40} ; 
        printArray(AppendArray(A , B)) ; 
    }
    
    public static int [] AppendArray(int A[] , int B[]) {
        int [] Append = new int [A.length+ B.length] ; 
        for(int i = 0 ; i < A.length ; ++i){
            Append[i] = A[i] ; 
        }
        int k = 0 ;
        for(int i = A.length ; k< B.length ; ++i){
            Append[i] = B[k] ;
            k++ ; 
        }
        return Append ; 
    }
    
    public static void printArray(int[] src) {
        for (int i = 0; i < src.length; i++) {
            if (i == src.length - 1) {
                System.out.print(src[i] + "\n");
            } else {
                System.out.print(src[i] + ", ");
            }
        }
    }
}
