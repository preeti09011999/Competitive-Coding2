import java.util.*;
import java.io.*;

public class maxSum {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++) 
            arr[i] = scn.nextInt();

        int k = scn.nextInt();
        int dp[][] = new int[k+1][n];

        // filling dp
        for(int i=0;i<k+1;i++) {
            for(int j=0;j<n;j++) {
                if(i == 0)
                    dp[i][j] = 0;
                else if(j == 0) 
                    dp[i][j] = arr[0];
                else if(i == 1) {
                    dp[i][j] = Integer.max(dp[i][j-1], arr[j]);
                }
                else {
                    int value1 = (i-1 >= 0 && j-2 >= 0) ? dp[i-1][j-2] + arr[j] : Integer.MIN_VALUE;
                    int value2 = dp[i][j-1];
                    dp[i][j] = Integer.max(value1, value2);
                }
            }
            // System.out.println(Arrays.toString(dp[i]));
        }

        System.out.println(dp[k][n-1]);

    }

}
