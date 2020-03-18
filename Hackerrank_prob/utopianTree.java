import java.util.*;

public class Main{

public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int[] arr = new int[n];
   int[] arr2 = new int[n];
   for(int i=0;i<n;i++){
       arr[i] = scn.nextInt();
   }
   int max = 0;
   for(int i=0;i<n;i++){
       if(arr[i]>max){
           max = arr[i];
       }
   }
  int a = max;
// System.out.print(a);
   int count =1;
   for(int j=0;j<=a;j++){
       
       if(j%2!=0&&j!=0){
           count *= 2;
       }
       if(j%2==0&&j!=0){
           count += 1;
       }
       for(int k=0;k<n;k++){
           if(j==arr[k]){
               arr2[k] = count;
           }
       }
   }
   for(int h=0;h<n;h++){
       System.out.println(arr2[h]);
   }
    }
}