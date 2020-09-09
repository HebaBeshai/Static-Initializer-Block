import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static Scanner scan = new Scanner(System.in);
static int B = scan.nextInt();
static int H = scan.nextInt();
static boolean flag =true; //how khuri learned her's because of the flag

static{
     try{
        if(B<=0||H<=0){
            flag=false;
            throw new Exception("Breadth and height must be positive");
        }//end of if
     }//end of try statement
     catch(Exception e){
            System.out.println(e);
     }//end of catch statement
     }//end of static block

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

