import java.util.*;
import java.lang.Math; 

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int x1 = scn.nextInt();
  int v1 = scn.nextInt();
  int x2 = scn.nextInt();
  int v2 = scn.nextInt();
  int looplen = (x1+v1)*(x2+v2); 
  int sum1 = x1;
  int sum2 = x2;
  int count = 0;
  for(int i=0;i<=looplen;i++){
      sum1 = sum1 + v1;
      sum2 = sum2 + v2;
      if(sum1==sum2){
          count++;
      }
  }
  if(count>=1){
      System.out.print("YES");
  }
  else{
      System.out.print("NO");
  }
}
}