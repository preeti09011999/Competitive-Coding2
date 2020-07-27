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

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        int day = 13;
        boolean flag = false;
        if(year < 1919 && year % 4== 0){
            flag = true;
            day = 12;
        }
        if(year >= 1919 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            flag = true;
            day = 12;
        }
        if(year == 1918){
            day = 26;
        }
        System.out.println(day+"."+"09"+"."+year);
    }
}
