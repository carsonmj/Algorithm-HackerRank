package me.study.hackerrank;
import java.math.BigInteger;
import java.util.*;

public class z_utils {
	
	/**
	 * String 형태의 List를 String 형태의 Array로 변환하는 메소드
	 * @param list<String>
	 * @return String[]
	 */
	public static String[] toStringArray(List<String> list) {
		String[] array = new String[list.size()];
		list.toArray(array);
		return array;
	}

	/**
	 * Integer 형태의 List를 int 형태의 Array로 변환하는 메소드
	 * @param list<Integer>
	 * @return int[]
	 */
	public static int[] toIntArray(List<Integer> list) {
		return list.stream().mapToInt(e -> e).toArray();
	}
	
	/**
	 * 특정 문자열이 어느 문자열에 몇 개 있는지 세는 메소드
	 * @param String str
	 * @param String countStr
	 * @return int
	 */
   public static int count(String str, String countStr) {
	      int formIndex = -1;
	      int count = 0;
	      while ((formIndex = str.indexOf(countStr, formIndex + 1)) > -1) {
	         count++;
	      }
	      return count;
	}
   
   /**
    * 소수구하는 자바 메서드
    * @param number
    * @return
    */
   public boolean isPrime(String number) {
      return new BigInteger(number).isProbablePrime(1);
   }
}

