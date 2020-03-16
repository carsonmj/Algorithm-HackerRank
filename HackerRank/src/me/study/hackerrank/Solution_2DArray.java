package me.study.hackerrank;

import java.io.*;
import java.util.*;

public class Solution_2DArray {

	//============================
	//방법 1
	//============================
	public static void main(String[] args) {
		int[][] a = new int[6][6];
		int maxSum = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = scan.nextInt();
				if (i > 1 && j > 1) {
					int sum = a[i][j] + a[i][j - 1] + a[i][j - 2] 
							  + a[i - 1][j - 1] 
							  + a[i - 2][j] + a[i - 2][j - 1]+ a[i - 2][j - 2];
					if (sum > maxSum) {
						maxSum = sum;
					}
				}
			}
		}
		scan.close();
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println(maxSum);
	}
	
	//============================
	//방법 2
	//============================
	public int solution(int[][] arr) {
	    int max = Integer.MIN_VALUE;
	    int sum;

	    for (int i = 2; i < 6; i++) {
	        for (int j = 2; j < 6; j++) {
	            sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2]
	                    + arr[i - 1][j - 1]
	                    + arr[i - 2][j] + arr[i - 2][j - 1] + arr[i - 2][j - 2];
	            max = Math.max(max, sum);
	        }
	    }
	    System.out.println(max);
	    return max;
	}
}
