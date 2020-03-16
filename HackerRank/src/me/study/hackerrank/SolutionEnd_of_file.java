package me.study.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionEnd_of_file {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = 0;
    	List<String> arr = new ArrayList<String>();
    	String sc2 = null;
    	while(sc.hasNext()) {
    		sc2 = sc.nextLine();
    		num++;
    		arr.add(num +" "+sc2);
    	}
    	sc.close();
    	for(int i=0; i<arr.size(); i++) {
    		System.out.println(arr.get(i));
    	}
    }
}
