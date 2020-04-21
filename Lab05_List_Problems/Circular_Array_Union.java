package Lab05_List_Problems;

public class Circular_Array_Union {
    public static void main(String[] args) {
        int [] a = {1,2,2,5,8};
        int [] b = {1,3,4,6,8};
        int [] countA = new int [1000000];
        int [] countB = new int [1000000];
        int startA = 4;
        int startB = 2;
        for(int i=startA; i<countA.length; i++) {
            countA[a[i%a.length]]++;
        }
        for(int i=startB; i<countB.length; i++) {
            countB[b[i%b.length]]++;
        }
        for(int i=0; i<1000000; i++) {
                if(countA[i]!=0 || countB[i]!=0) {
                    System.out.print(i+" ");
                }
        }
    }
}
