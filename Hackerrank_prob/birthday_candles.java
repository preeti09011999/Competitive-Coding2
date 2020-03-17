import java.util.*;

public class Main{

public static void main(String[] args) {

// write your code here.
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int max = 0;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    int count = 0;
    for(int i=0;i<n;i++){
        if(arr[i]==max){
            count++;
        }
    }
    System.out.print(count);
}
}