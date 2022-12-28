package Regexx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class reg {

	public static void main(String[] args) {
		// Regex ve Lambda kullanýmý
		
				List<String> emailler = Arrays.asList("ali@gmail.com","mehmet@hotmail.com","ayse@gmail.com",
						"elif@hotmail.com","erkan@gmail.com","yasin@hotmail.com");
				
				Predicate<String> emailFiltre = Pattern
						.compile("^(.+)@hotmail.com$")
						.asPredicate();
				
				//lambda ile filtreleyelim
				List<String> liste = emailler
						.stream()
						.filter(emailFiltre)
						.collect(Collectors.toList());
				
				System.out.println(liste);

	}

}
