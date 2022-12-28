package Regexx;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reglambda {

	public static void main(String[] args) {
		// Regex ile filtreleme

				List<String> emailler = Arrays.asList("ali@gmail.com","mehmet@hotmail.com","ayse@gmail.com",
						"elif@hotmail.com","erkan@gmail.com","yasin@hotmail.com");

				Pattern pattern = Pattern.compile("^(.+)@hotmail.com$");

				for(String email : emailler) {  //python for i in liste
					Matcher matcher = pattern.matcher(email);

					if(matcher.matches()) System.out.println(email);

				}
	}

}
