import java.util.*;

public class Main{

public static void main(String[] args) {

// write your code here.
    Scanner scn = new Scanner(System.in);
    int totHurdle = scn.nextInt();
    int[] arr = new int[totHurdle];
    int initialH = scn.nextInt();
    for(int i=0;i<totHurdle;i++){
        arr[i] = scn.nextInt();
    }
    int max = 0;
    for(int i=0;i<totHurdle;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    int totPotion;
    if(max>initialH){
        totPotion = max - initialH; 
    }
    else 
        totPotion = 0;
        
    System.out.print(totPotion);
        
    }
}