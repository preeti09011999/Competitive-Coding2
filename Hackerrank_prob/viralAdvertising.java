import java.util.*;
import java.lang.Math; 

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int shared = 5;
  int cumulative = 0;
  for(int i=0;i<n;i++){
      int liked = shared/2;
      shared = liked*3;
      cumulative = cumulative+liked;
  }
  System.out.print(cumulative);

  }
}