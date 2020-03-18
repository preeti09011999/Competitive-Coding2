import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[] arr = new int[26];
    String str = new String();
    for(int i = 0; i<26;i++){
        arr[i] = scn.nextInt();
    }
    str = scn.next();
    int[] arr2 = new int[str.length()];
    int max = 0;
    for(int j=0;j<str.length();j++){
        int count = 0;
        for(char alphabet = 'a';alphabet<='z';alphabet++){
            
                if(alphabet==str.charAt(j)){
                    arr2[j] = arr[count];
                    // System.out.print(arr2[j]);
                }
                count++;
        }
    }
    
    for(int k=0;k<str.length();k++){
        if(arr2[k]>max){
            max = arr2[k];
        }
    }
    
    System.out.print(max*(str.length()));
        
    }
}