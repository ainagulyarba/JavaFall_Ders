package day16_forLoop;

import java.util.Scanner;
public class C08 {

	public static void main(String[] args) {
/*
		Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
		input : ade1r4d3
		output : 8
	 	Hint : Use Character.isDigit()
		     Integer.valueOf()
		    
*/
		String krk = "ade1r4d3";
		
		String sum []=krk.split("");
		
		int toplam= 0;
		
		for (int i = 0; i < sum.length; i++) {
			
			if (Character.isDigit(sum[i].charAt(0))) {
				
				
				toplam+=Integer.valueOf(sum[i]);
			}
		}
		
			
		System.out.println(toplam);
			
		
		
	}
}