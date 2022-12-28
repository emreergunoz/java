package Regexx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_5 {

	public static void main(String[] args) {
		//Regular Expressions - RegEx
				/*
				String hello = "HelloxxxHelloxxxHello";
		        Pattern pattern = Pattern.compile("Hello");
		        Matcher matcher = pattern.matcher(hello);
		        
		        int count = 0;
		        while (matcher.find())
		            count++;

		        System.out.println(count);    // prints 3 */

				/*
				 [abc]	a, b, or c (simple class)
				 [abc]? once
				 [abc]+ one or more
				 [abc]* zero or more 
				 [^abc]	Any character except a, b, or c (negation)
				 [a-zA-Z]	a through z or A through Z, inclusive (range)
		         [a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
		         [a-z&&[def]]	d, e, or f (intersection)
		         [a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
		         [a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
				 */
				
		        
		        
		        String s = "Ba�ka garip bir �ifre-yaz� olay� da, 1917�de, en iyi " + 
		        		"Bacon uzmanlar�ndan biri olan Viyana�l� Doktor " + 
		        		"Alfred Von Weber Ebenhoff taraf�ndan sunuldu." + 
		        		"Ebenhoff, daha �nce Shakespeare�in yap�tlar�nda " + 
		        		"denenmi� olan dizgeleri, Cervantes�in baz� " + 
		        		"yap�tlar�na uygulamaya ba�lad�... Bu �al��ma " + 
		        		"s�ras�nda, �a��rt�c�, somut bir kan�t ortaya ��kard�: " + 
		        		"Don Ki�ot�un Shelton taraf�ndan yap�lm�� ilk" + 
		        		"�evirisinde, Bacon�un elyaz�s�yla d�zeltmeler " + 
		        		"vard�. Ebenhoff, bundan, bu �ngilizce metnin " + 
		        		"roman�n asl� oldu�u, Cervantes�in bunun " + 
		        		"�spanyolca de�i�kesini yay�mlad��� sonucuna " + 
		        		"vard�";
				
		        Pattern pattern = Pattern.compile("[bu]{2}[a-z]{3}");
		        Matcher matcher = pattern.matcher(s);    
		        int count = 0;
		        while (matcher.find()) count++;
		        System.out.println(count);

	}

}
