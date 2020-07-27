import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

       private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n = scn.nextInt();
        int m = scn.nextInt();
        int kb[] = new int[n];
        int usb[] = new int[m];
        for(int i=0;i<n;i++){
            kb[i] = scn.nextInt();
        }
        for(int i=0;i<m;i++){
            usb[i] = scn.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(kb[i]+usb[j]<=b && kb[i]+usb[j]>sum){
                    sum = kb[i]+usb[j];
                }
            }
        }
        if(sum == 0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
        }
    }
}
