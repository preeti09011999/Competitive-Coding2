
import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int k=0;k<n;k++){
            String input = s.nextLine();            
        if (checkIsPrime(input)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
        }         
    }

    public static boolean checkIsPrime(String input){
        int len = str.length();
        int n = 0;
        for (int i = 0; i < len; i++) 
            n += (int)str.charAt(i); 
      
        // Corner cases 
        if (n <= 1) 
            return false; 
        if (n <= 3) 
            return true; 
      
        // This is checked so that we can skip 
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false; 
      
        return true; 
    }
}