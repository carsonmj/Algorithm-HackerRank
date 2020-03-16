package me.study.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_List {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		//List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			list.add(scan.nextInt());
		}
		
		int Q = scan.nextInt();
		String query = "";
		for(int i=0; i<Q; i++) {
			query = scan.next();
			if( query.equals("Insert") ) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				list.add(x, y);
			}else {
				int x = scan.nextInt();
				try{
					list.remove(x);
				}catch(Exception e) {
					System.out.println("x is out of range");
				}
					
			}
		}
		for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}

