import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int diff=sc.nextInt();
        int z=pep(a,diff);
        System.out.println(z);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
   
    public static int pep(int[] a, int diff)
     {
        Map<Integer,Integer> map=new HashMap<>();
        int max = 1;
        for (int i = 0; i <a.length ; i++) {
            int target=a[i]-diff;
            if(map.containsKey(target))
                map.put(a[i],map.get(target)+1);
            else{
                map.put(a[i],1);
            }
            max=Math.max(max,map.get(a[i]));
        }
        return max;
    }
}