import java.util.*;

public class Main{

public static void main(String[] args) {

// write your code here.
    Scanner scn = new Scanner(System.in);
    String input = scn.nextLine();
    String[] str = input.split(":");
    char a = input.charAt(8);
    int num1 = Integer.parseInt(str[0]);
    String last = str[2];
    String[] last1 = last.split("[a-zA-Z]");
    
    if(a=='A'){
        if(num1==12){
            System.out.print("00"+":"+str[1]+":"+last1[0]);
        }
        else{
            System.out.print(str[0]+":"+str[1]+":"+last1[0]);
        }
    }
    if(a=='P'){
        if(num1!=12){
            num1 += 12;
            System.out.print(num1+":"+str[1]+":"+last1[0]);
        }
        else{
        System.out.print(num1+":"+str[1]+":"+last1[0]);
        }
    }
}
}