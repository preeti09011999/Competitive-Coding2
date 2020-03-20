import java.util.*;
import java.lang.Math; 

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int[] arr = new int[n];
  int num1;
  for(int i=0;i<n;i++){
      int num = scn.nextInt();
      if(num<38){
        num1 = num;
      }
      else{
          int r = num/5;
          r = r+1;
          int num2 = r*5;
          int diff = num2-num;
          if(diff<3){
              num1 = num2;
          }
          else{
              num1 = num;
          }
      }
      arr[i]=num1;
  }
  for(int j=0;j<n;j++){
      System.out.println(arr[j]);
  }
}
}