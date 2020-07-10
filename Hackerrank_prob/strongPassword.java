import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        if(n>=6){
            int count = 0;
            boolean numb = false;
            boolean low = false;
            boolean special = false;
            boolean upper = false;
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch >= '0' && ch <= '9'){
                    numb = true;
                } 
                if(ch >= 'a' && ch <= 'z') {
                    low = true;
                }    
                if(ch >= 'A' && ch <= 'Z'){
                    upper = true;
                }
                if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '(' || ch == ')' || ch == '%'|| ch == '^' || ch == '&' || ch== '*'|| ch=='-'||ch=='+'){
                    special = true;
                }
            }
            if(numb == true){
                count++;
            }
            if(low == true){
                count++;
            }
            if(upper == true){
                count++;
            }
            if(special == true){
                count++;
            }
            System.out.println(4-count);
        }else{
            System.out.println(6-n);
        }
    }
}
