package me.study.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.security.MessageDigest;
import java.util.regex.*;
import java.util.Scanner;

public class Solution_SHA_256 {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		StringBuffer hexString = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(s1.getBytes("UTF-8"));
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		System.out.println(hexString.toString());
	}
}// end of class
