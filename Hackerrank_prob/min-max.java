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
    int arr[] = new int[5];
    for(int i =0;i<5;i++){
        arr[i] = scn.nextInt();
    }
    int arr2[] = new int[5];
    int max = 0;
    for(int i=0;i<5;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    int min = max;
    for(int i=0;i<5;i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    int sumMin=0, sumMax =0;
    for(int i=0;i<5;i++){
        if(arr[i]!=min){
            sumMax += arr[i];
        }
        if(arr[i]!=max){
            sumMin += arr[i];
        }
    }
    
    System.out.print(sumMin + " "+sumMax);
    }
}
