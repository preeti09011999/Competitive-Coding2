import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws IOException {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = scn.nextInt();
       }
       int d = scn.nextInt();
       int m = scn.nextInt();
       int count = 0;
       int sum = 0;
       for(int i=0;i<m;i++){
           sum += arr[i];
       }
       if(sum % d == 0){
           count += 1;
       }
       for(int i=1;i<=n-m;i++){
           sum += arr[i+m-1]-arr[i-1]; 
           if(sum % d == 0){
               count++;
           }
       }
       System.out.println(count);
    }
}
