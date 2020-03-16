package me.study.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_Datatypes {
	static int B=0;
	static int H=0;
	static boolean flag = false;
	static {
		String warning = "java.lang.Exception: Breadth and height must be positive";
		try {
			Scanner sc = new Scanner(System.in);
			B=sc.nextInt();
			H=sc.nextInt();
			sc.close();
			if(B<=0 || H<=0) {
				System.out.print(warning);
			}else {
				flag = true;
			}
		}catch(Exception e) {
			System.out.print(warning);
		}
	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}//end of main
}//end of class

