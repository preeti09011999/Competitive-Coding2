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
        
        int flag = 0;
        int r = 1;
        while(r<n-1){
            int isum = 0;
        int nsum = 0;
            for(int i=0;i<r;i++){
                isum = isum + arr[i];
            }
            for(int j=r+1;j<n;j++){
                nsum = nsum + arr[j];
            }
            
            if(isum == nsum){
                flag = 1;
                System.out.println(r);
            }
            r++;
        }
        if(flag == 0){
            System.out.println("-1");
        }
    
    }
}