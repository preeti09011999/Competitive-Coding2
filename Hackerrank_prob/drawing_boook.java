import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        if(p <= n-p){
            int count = 0;
            for(int i=2;i<=p;i=i+2){
                count++;
            }
            System.out.println(count);
        }
        else{
  
            if(n==p || (p == n-1 && n%2!=0)){         
                System.out.println("0");
            }else{
                int count = 0;
                if(n%2 == 0){
                    for(int i=n-1;i>=p;i-=2){
                        count++;
                    }
                }else{
                    for(int i=n-2;i>=p;i-=2){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}
