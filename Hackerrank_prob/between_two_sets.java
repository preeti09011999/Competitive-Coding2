import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int m = scn.nextInt();
        int narr[] = new int[m];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        for(int i=0;i<m;i++){
            narr[i] = scn.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            if(narr[i]<min){
                min = narr[i];
            }
        }
        // System.out.println(min);
        int count;
        int mcount;
        int fcount = 0;
        for(int i=1;i<=min;i++){
            count = 0;
            mcount = 0;
            for(int j=0;j<m;j++){
                
                if(narr[j]%i==0){
                    count++;
                }
            }
            
            if(count == m){
                for(int k=0;k<n;k++){
                    if(i%arr[k]==0){
                        mcount++;
                    }
                }
                
                
                if(mcount == n){
                    fcount++;
                }
            }
        }
        System.out.println(fcount);
        
    }
}
