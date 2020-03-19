import java.util.*;
import java.lang.Math; 

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n1 = scn.nextInt();
  int n2 = scn.nextInt();
  int[] arr = new int[n2-n1+1];
  int[] arrrev = new int[n2-n1+1];
  int k = scn.nextInt();
  int j=0;
  int dicount =0;
  for(int i=n1;i<=n2;i++){
      int count = 0;
      int numc = i;
      while(numc!=0){
          numc = numc/10;
          count++;
      }
      int num = 0;
      int numr = i;
      int powr = (int)Math.pow(10,count-1);
      while(numr!=0){
         int r = numr%10;
         num = num + r*powr;
         powr=powr/10;
         numr = numr/10;
      }
      arrrev[j] = num;
      arr[j] = i;
      j++;
  }
  
  for(int i=0;i<(n2-n1+1);i++){
      int div = Math.abs(arrrev[i]-arr[i]);
      if(div%k==0){
          dicount++;
      }
  }
  System.out.print(dicount);

  }
}