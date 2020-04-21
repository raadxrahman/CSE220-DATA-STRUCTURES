package Lab05_List_Problems;

public class Array_Intersection {
    public static void main(String[] args) {
        int [] a = {1,2,2,5,8};
        int [] b = {1,3,4,6,8};
        int [] countA = new int [1000000];
        int [] countB = new int [1000000];
        for(int i=0; i<a.length; i++) {
            countA[a[i]]++;
        }
        for(int i=0; i<b.length; i++) {
            countB[b[i]]++;
        }
        for(int i=0; i<1000000; i++) {
                if(countA[i]!=0 && countB[i]!=0) {
                    System.out.print(i+" ");
                }
        }
    }
}
