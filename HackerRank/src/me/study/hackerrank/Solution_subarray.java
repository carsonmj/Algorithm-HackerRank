package me.study.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_subarray {

	public static void test(String[] args) {
		// ============
		// 방법 1
		// ============
		int N = 4;
		int[] arr = { 2, 1, 3, 4 };
		int cnt = 0;
		int sum = 0;
		int idx = 0;

		while (idx < N) {

			for (int j = 0; j < N; j++) {
				int i = 1;
				while (i == 1) {
					sum = arr[i++];
					if (sum < 0) {
						cnt++;
					}
				}
				while (i == 2) {
					sum = arr[i++];
					if (sum < 0) {
						cnt++;
					}
				}
				while (i == 3) {
					sum = arr[i++];
					if (sum < 0) {
						cnt++;
					}
				}
				while (i == 4) {
					sum = arr[i++];
					if (sum < 0) {
						cnt++;
					}
				}
			}
		}

		// ============
		// 방법 2
		// ============
//	      int N = 4;
//	      int[] arr = { 2, 1, 3, 4 };
//	      int cnt = 0;
//	      int sum = 0;
//	      int idx = 0;

//	      idx = 0;
//	      sum = arr[idx++];
//	      if (sum < 0) cnt++;
//	      sum = arr[idx++];
//	      if (sum < 0) cnt++;
//	      sum = arr[idx++];
//	      if (sum < 0) cnt++;
//	      sum = arr[idx++];
//	      if (sum < 0) cnt++;
//
//	      idx = 0;
//	      sum = arr[idx++] + arr[idx];
//	      if (sum < 0) cnt++;
//	      sum = arr[idx++] + arr[idx];
//	      if (sum < 0) cnt++;
//	      sum = arr[idx++] + arr[idx];
//	      if (sum < 0) cnt++;
//
//	      idx = 0;
//	      sum = arr[idx++] + arr[idx++] + arr[idx--];
//	      if (sum < 0) cnt++;
//	      sum = arr[idx++] + arr[idx++] + arr[idx];
//	      if (sum < 0) cnt++;
//
//	      idx = 0;
//	      sum = arr[idx++] + arr[idx++] + arr[idx++] + arr[idx++];
//	      if (sum < 0) cnt++;
//	      
//	      System.out.println(cnt);

	}

	private static int subArrCnt = 0;
	private static ArrayList<Integer> subArr = new ArrayList<>();
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scn = new Scanner(System.in);
		int eleCnt = scn.nextInt();
		int[] arr = new int[eleCnt];
		for (int i = 0; i < eleCnt; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();
		//a는 배열의 인덱스번호 별로 끊어주는 기능 
		//(ex.a=0 -> 인덱스번호 0번부터 / a=1 -> 인덱스번호 1번부터)
		for (int a = 0; a < arr.length; a++) {
			//i는 단순히 인덱스 0~3까지 반복적으로 돈다.
			for (int i = 0; i < arr.length; i++) {
				//j는 i와 같을 때 까지 반복하는 반복문
				for (int j = a; j <= i; j++) {
					subArr.add(arr[j]);
				}
				int sum = 0;
				if (subArr.size() > 0) {
					for (int t : subArr) {
						sum += t;
					}
					if (sum < 0)
						subArrCnt++;
				}
				subArr.clear();
			}
		}
		System.out.println(subArrCnt);
	}

}
