import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the stepPerms function below.
    static int stepPerms(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if((i-1)>=0){
                dp[i] += dp[i-1]; 
            }if((i-2)>=0){
                dp[i] += dp[i-2];
            }if((i-3)>=0){
                dp[i] += dp[i-3];
            }
        }
        return dp[n];
    }


    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0;i<t;i++){
            int n = scn.nextInt();
            long val = (long)Math.pow(10,10)+7;
            long res = stepPerms(n);
            res = res % val;
            System.out.println(res);
        }
    }
}
