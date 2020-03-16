package me.study.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_ArrayList {

	public static void main(String[] args) {
		//==================================================
		//방법 1
		//==================================================
//    	Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int d, q, x, y;
//
//        ArrayList[] arrayList = new ArrayList[n];
//
//        for (int i = 0; i < n; i++) {
//            d = scanner.nextInt();
//            arrayList[i] = new ArrayList();
//
//            for (int j = 0; j < d; j++) {
//                arrayList[i].add(scanner.nextInt());
//            }
//        }
//
//        q = scanner.nextInt();
//        for (int i = 0; i < q; i++) {
//            x = scanner.nextInt();
//            y = scanner.nextInt();
//            try {
//                System.out.println(arrayList[x - 1].get(y - 1));
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println("ERROR!");
//            }
//        }
//        scanner.close();

		
		//==================================================
		//방법 2
		//==================================================
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		ArrayList<ArrayList<Integer>> all = new ArrayList<>();
//		for (int i = 0; i < n; i++) {
//			int d = sc.nextInt();
//			ArrayList<Integer> l = new ArrayList<>();
//			for (int j = 0; j < d; j++) {
//				l.add(sc.nextInt());
//			}
//			all.add(l);
//		}
//		int q = sc.nextInt();
//		for (int i = 0; i < q; i++) {
//			int q1 = sc.nextInt();
//			int q2 = sc.nextInt();
//			if (q2 > all.get(q1 - 1).size())
//				System.out.println("ERROR!");
//			else
//				System.out.println(all.get(q1 - 1).get(q2 - 1));
//		}

		
		//==================================================
		//방법 3
		//==================================================
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int d = in.nextInt();
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				row.add(in.nextInt());
			}
			rows.add(row);
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			try {
				System.out.println(rows.get(x - 1).get(y - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		
		
		//==========================================
		//복습
		//==========================================
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
//		for(int s=0; s<N; s++) {
//			int d = scan.nextInt();
//			ArrayList<Integer> row = new ArrayList<>();
//			for(int j=0; j<d; j++) {
//				row.add(scan.nextInt());
//			}
//			rows.add(row);
//		}
//		int q = scan.nextInt();
//		for(int i=0; i<q; i++) {
//			int x = scan.nextInt();
//			int y = scan.nextInt();
//			try {
//				System.out.println(rows.get(x-1).get(y-1));
//			}catch(IndexOutOfBoundsException e) {
//				System.out.println("Error!");
//			}
//		}
		
	}
}
