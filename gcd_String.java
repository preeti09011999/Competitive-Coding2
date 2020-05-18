import java.io.*;
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0;i<t;i++){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(gcd(a,b));
        }
        
    }
    
    public static int gcd(int a,int b){

        if(a%b==0){
            String str = "1";
            for(int i=0;i<a-1;i++){
                str += "0";
            }
            int numb = Integer.parseInt(str,2);
            return numb;
        }else{
           int val = gcd(b,a%b);
           int temp = val;
           String strr = "";
           
           String evalt = Integer.toBinaryString(val);
           int idx = 0;
           for(int i=0;i<a;i++){
               if(idx >= evalt.length()){
                   idx = 0;
               }
               strr += evalt.charAt(idx);
               idx++;
           }
           int num2 = Integer.parseInt(strr,2);
           return num2;
           
        }
    }
}