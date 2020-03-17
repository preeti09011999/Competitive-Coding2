import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
            // write ur code here
            int n = scn.nextInt();
            int irow = 1;
            int nstar = 1;
            int nrow = n;
            int nspace = n-1;
            while(irow<=nrow){
                int istar = 1;
                int ispace = 1;
                while(ispace<=nspace){
                    System.out.print(" ");
                    ispace++;
                }
                
                while(istar<=nstar){
                    System.out.print("#");
                    istar++;
                }
                irow++;
                nspace--;
                nstar++;
                System.out.println();
            }
    }
}