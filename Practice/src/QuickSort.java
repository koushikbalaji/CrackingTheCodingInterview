import java.util.*;
public class QuickSort {
       
          static void quickSort(int[] ar) {
              int pivot=ar[0];
             // int leftSubArray[(int) (Math.floor(ar.length)/2)]=new int[(int)Math.floor(ar.length)/2];
                    
       }
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar);
       }    
   }
