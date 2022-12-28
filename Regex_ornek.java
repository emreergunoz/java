package Ornekler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_ornek {

	public static void main(String[] args) {
		String s = "selam";
        Pattern pattern = Pattern.compile("[a-z[^a]]{2}");
        Matcher matcher = pattern.matcher(s);  

        int sayac = 0;
        while (matcher.find()) sayac++;

        System.out.println(sayac); 
        System.out.println(Pattern.matches("[selam]+", "ss")); 
}}
