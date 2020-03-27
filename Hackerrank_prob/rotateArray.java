import java.util.*;
import java.lang.Math; 
public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int[] arr = new int[n];
  for(int i=0;i<n;i++){
      arr[i] = scn.nextInt();
  }

  int k = n-1;
  int temp =0;
  for(int j=0;j<n/2;j++){
      temp = arr[j];
      arr[j] = arr[k];
      arr[k] = temp;
      k--;
      
  }
  for(int g=0;g<n;g++){
      System.out.print(arr[g]+" ");
  }
  
}
}