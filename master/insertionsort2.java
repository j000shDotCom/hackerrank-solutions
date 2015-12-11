import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {
           for (int j = 1; j < ar.length; ++j) {
               boolean inserted = false;
               int m = j;
               int i = m - 1;
               while (!inserted && i >= 0) {
                   if (ar[i] > ar[m]) {
                       int temp = ar[m];
                       ar[m--] = ar[i];
                       ar[i--] = temp;
                   } else {
                       inserted = true;
                   }
               }
               printArray(ar);
           }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}

