package Regexx;

import java.util.regex.Pattern;

public class Regex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
				.	Any character (may or may not match terminator)
				\d 	Any digits, short of [0-9]
				\D	Any non-digit, short for [^0-9] 
				\s	Any whitespace character, short for [\t\n\x0B\f\r]
				\S	Any non-whitespace character, short for [^\s]
				\w	Any word character, short for [a-zA-Z_0-9]
				\W	Any non-word character, short for [^\w]
				\b	A word boundary
				\B	A non word boundary
		*/
				
				System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
				System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
				System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
				System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
				
				System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
				System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
				System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
				System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
				System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
				
				System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aruz32"));//true  
				System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false 
				System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
				System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false   
				
				
				System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
				System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
				  
				System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
				System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
				System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
				  
				  
				System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
				System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)

	}

}
