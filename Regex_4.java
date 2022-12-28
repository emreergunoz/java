package Regexx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_4 {

	public static void main(String[] args) {
			String s = "insan tepkileri içinde en belirgini gerçeði reddetmektir";
	        Pattern pattern = Pattern.compile(".e."); //ortasýnda e olan 3 harfli metin
	        Matcher matcher = pattern.matcher(s);    

	        int count = 0;
	        while (matcher.find()) count++;

	        System.out.println(count);
	        
	        System.out.println(Pattern.matches("[erg]{3}[eçk]{3}", "gerçek"));

	}

}
