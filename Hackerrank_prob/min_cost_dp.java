import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i == 0 && j == 0) {
                    dp[0][0] = arr[i][j];
                }
                else {
                    int value1 = i-1 >= 0 ? dp[i-1][j] : Integer.MAX_VALUE;
                    int value2 = j-1 >= 0 ? dp[i][j-1] : Integer.MAX_VALUE;
                    int value3 = (i-1 >= 0 && j-1 >= 0) ? dp[i-1][j-1] : Integer.MAX_VALUE;
                    dp[i][j] = Math.min(value1, Math.min(value2, value3)) + arr[i][j];
                }
            }
        }

        System.out.println(dp[m-1][n-1]);
    }
}