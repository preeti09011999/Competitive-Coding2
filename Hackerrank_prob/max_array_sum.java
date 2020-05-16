import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int n = arr.length;
        int dp[][] = new int[2][n];
        dp[0][0] = 0;
        dp[1][0] = arr[0];
        for(int col = 1;col < n;col++){
            //exclude 
            dp[0][col] = Math.max(dp[0][col-1],dp[1][col-1]);
            //include
            dp[1][col] = dp[0][col-1] + arr[col]; 
        }

        int res = Math.max(dp[0][n-1],dp[1][n-1]);
        return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(maxSubsetSum(arr));
        
    }
}