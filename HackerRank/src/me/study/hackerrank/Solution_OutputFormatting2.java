package me.study.hackerrank;
import java.util.Scanner;


public class Solution_OutputFormatting2 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //System.out.printf("%-16.15s%03d",s1,x);
            //System.out.println("");
            System.out.printf("%-15s",s1);
            System.out.printf("%03d%n",x);
        }
        System.out.println("================================");

	}
}//end of class

