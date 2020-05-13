import java.io.*;
import java.util.*;

public class Solution {
 public static void main(String[] args)  
    {  
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        boolean flag = true; 
          
        int temp =0; 
       
        for (int i=0; i<=arr.length-2; i++) 
        { 
            if (flag) 
            {   
                if (arr[i] > arr[i+1]) 
                {      
                    temp  = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                } 
            } 
            else 
            { 
                if (arr[i] < arr[i+1]) 
                {        
                    temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                } 
            } 
            flag = !flag; 
        } 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }  
    } 
}