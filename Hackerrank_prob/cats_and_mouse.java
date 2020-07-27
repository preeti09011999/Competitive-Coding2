import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n>0){
            int c1 = scn.nextInt();
            int c2 = scn.nextInt();
            int m = scn.nextInt();
            if(Math.abs(c1-m)==Math.abs(c2-m)){
                System.out.println("Mouse C");
            }else if(Math.abs(c1-m)>Math.abs(c2-m)){
                System.out.println("Cat B");
            }else{
                System.out.println("Cat A");
            }
            n--;
        }
    }
}
