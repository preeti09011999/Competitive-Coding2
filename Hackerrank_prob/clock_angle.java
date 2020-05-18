import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scn = new Scanner(System.in);
      	int hr = scn.nextInt();
      	float deg_long = scn.nextFloat();
      	System.out.println(cal_degree(hr,deg_long));
    }
  
	public static int cal_degree(int hr, float deg_long){
    
    	float hour = (hr*deg_long)/360;
      	int h = (int)hour;
        float dec_val = hour - (float)h;
        float m = dec_val * 60;
        int hour_angle = (int)(0.5 *(h*60 + m));
        int minute_angle = (int)(6*m);
        int angle = Math.abs(hour_angle-minute_angle);
        return angle;
    }
}