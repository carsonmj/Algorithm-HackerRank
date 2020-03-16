package me.study.hackerrank;
import java.util.*;
import java.io.*;

class Solution_StaticInitializerBlock{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int[] result = null;
        //int[][] finalResult = null;
        int t=in.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;
        //finalResult = new int[t][];
        ArrayList<int[]> list = new ArrayList<int[]>();
        for(int i=0;i<t;i++){
        	a = in.nextInt();
        	b = in.nextInt();
        	n = in.nextInt();
            for(int j=0; j<n; j++) {
            	if(j == 0) {
            		result = new int[n];
            		result[j] = (int) ((a + Math.pow(2, j)*b));
            		//finalResult[i][j] = (int) ((a + Math.pow(2, j)*b));
            		//System.out.println("finalResult"+i+" "+j+" = "+finalResult[i][j]);
            		System.out.println("result "+j+" = "+result[j]);
            	}else {
            		int before = result[j-1];
            		//int before = finalResult[i][j-1];
            		//finalResult[i][j] = (int) ((int) before + (Math.pow(2, j)*b));
            		result[j] = (int) ((int) before + (Math.pow(2, j)*b));
            		//System.out.println("finalResult"+i+" "+j+" = "+finalResult[i][j]);
            		System.out.println("result "+j+" = "+result[j]);
            		//result[j] = (int) ((int) before + ((a + Math.pow(2, j)*b)));
            	}
            	//finalResult[i] = result;
            }
            list.add(result);
            
            
        }
        in.close();
        
        //for(int k=0; k<result.length; k++) {
        //	System.out.println(k+" : "+result[k]);
        //}
        System.out.println("===========================");
        //for(int l=0; l<finalResult.length; l++) {
        	//System.out.println(l+" : "+finalResult[l]);
        //	System.out.println(l);
        //	System.out.println(Arrays.toString(finalResult[l]));
        //}
        for(int l=0; l<list.size(); l++) {
        	//System.out.println(Arrays.toString(list.get(l)));
        	for(int m=0; m<list.get(l).length; m++) {
        		System.out.print(list.get(l)[m] + " ");
        	}
        	System.out.println("");
        	
    	}
    }
}