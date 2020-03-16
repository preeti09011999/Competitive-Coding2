import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pos = 0,neg=0,zero=0;
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        for(int j=0;j<n;j++){
            
            if(arr[j]>0){
                pos += 1;
            }
            if(arr[j]<0){
                neg += 1;
            }
            if(arr[j]==0){
                zero += 1;
            }
        }

        double posfrac = (double)pos/n;
        double negfrac = (double)neg/n;
        double zerofrac = (double)zero/n;

        System.out.println(posfrac);
        System.out.println(negfrac);
        System.out.println(zerofrac);
    }
}
