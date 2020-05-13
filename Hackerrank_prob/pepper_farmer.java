import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(max_rain_water(arr,n));
        
    }
    public static int max_rain_water(int arr[],int n){
        int sum = 0; 
    for (int i = 1; i < n-1; i++) { 
          
       
        int left = arr[i]; 
        for (int j=0; j<i; j++) 
           left = Math.max(left, arr[j]); 
          
        int right = arr[i]; 
        for (int j=i+1; j<n; j++) 
           right = Math.max(right, arr[j]);  
         
       sum = sum + (Math.min(left, right) - arr[i]);    
    } 
  
    return sum;  
    }
}