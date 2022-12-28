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
				
		        
		        
		        String s = "Baþka garip bir þifre-yazý olayý da, 1917’de, en iyi " + 
		        		"Bacon uzmanlarýndan biri olan Viyana’lý Doktor " + 
		        		"Alfred Von Weber Ebenhoff tarafýndan sunuldu." + 
		        		"Ebenhoff, daha önce Shakespeare’in yapýtlarýnda " + 
		        		"denenmiþ olan dizgeleri, Cervantes’in bazý " + 
		        		"yapýtlarýna uygulamaya baþladý... Bu çalýþma " + 
		        		"sýrasýnda, þaþýrtýcý, somut bir kanýt ortaya çýkardý: " + 
		        		"Don Kiþot’un Shelton tarafýndan yapýlmýþ ilk" + 
		        		"çevirisinde, Bacon’un elyazýsýyla düzeltmeler " + 
		        		"vardý. Ebenhoff, bundan, bu Ýngilizce metnin " + 
		        		"romanýn aslý olduðu, Cervantes’in bunun " + 
		        		"Ýspanyolca deðiþkesini yayýmladýðý sonucuna " + 
		        		"vardý";
				
		        Pattern pattern = Pattern.compile("[bu]{2}[a-z]{3}");
		        Matcher matcher = pattern.matcher(s);    
		        int count = 0;
		        while (matcher.find()) count++;
		        System.out.println(count);

	}

}
