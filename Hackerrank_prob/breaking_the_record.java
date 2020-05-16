import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int min = 0;
        int max = 0;
        int maximum = arr[0];
        int minimum = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>maximum){
                maximum = arr[i];
                max++;
            }else {
                if(arr[i]<minimum){
                    minimum = arr[i];
                    min++;
                }
            }
        }
        System.out.print(max+" ");
        System.out.print(min);
    }
}