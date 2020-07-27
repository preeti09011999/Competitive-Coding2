import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = scn.nextInt();
    }
    int freq[] = new int[k];
    for(int i=0;i<n;i++){
      ++freq[arr[i]%k];
    }
    int sum = freq[0] * (freq[0]-1)/2;
    for(int i=1;i<=k/2 && i != (k-1);i++){
      sum += freq(i) * freq(k-i);
      if(k%2 == 0){
        sum += freq[k/2] * (freq[k/2]-1)/2;
      }
    }
    System.out.println(sum);
  }
}
