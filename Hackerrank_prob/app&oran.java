import java.util.*;
import java.lang.Math; 

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int s = scn.nextInt();
  int t = scn.nextInt();
  int a = scn.nextInt();
  int b = scn.nextInt();
  int m = scn.nextInt();
  int n = scn.nextInt();
  int[] arrm = new int[m];
  int[] arrn = new int[n];
  int countApple = 0;
  int countOrange = 0;
  int dec;
  for(int i=0;i<m;i++){
      int num = scn.nextInt();
      dec = a + num;
      if((s<dec||s==dec)&&(dec<t||dec==t)){
          countApple++;
      }
      
  }
  for(int j=0;j<n;j++){
      int num = scn.nextInt();
      dec = b + num;
      if((dec<t||t==dec)&&(s<dec||s==dec)){
          countOrange++;
      }
  }
  System.out.println(countApple);
  System.out.println(countOrange);
}
}