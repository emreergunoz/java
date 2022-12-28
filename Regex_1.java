package Regexx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {

	public static void main(String[] args) {
			// Regex - Pattern ve Matcher
			String s = "Bir berber bir berbere gel beraber bir berber dükkaný açalým demiþ";
	        Pattern pattern = Pattern.compile("be.");
	        Matcher matcher = pattern.matcher(s);        
	        

	        int sayac = 0;
	        while (matcher.find()) sayac++;

	        System.out.println(sayac); 

	}

}
