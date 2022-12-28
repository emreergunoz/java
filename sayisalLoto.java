package algoritma;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class sayisalLoto {

	public static void main(String[] args) {
		// Sayisal loto: 1-49 arasý listem olacak
		// bunlardan rastgele 6 tanesini seçeceðim.
		
		ArrayList<Integer> liste = new ArrayList<>();
		for(int i=1;i<=49;i++) liste.add(i);
		System.out.println(liste);
		
		Collections.shuffle(liste);
		System.out.println(liste);

		ArrayList<Integer> secilen = new ArrayList<>();
		for(int i=0;i<6;i++) secilen.add(liste.get(i));
		
		Collections.sort(secilen);
		System.out.println(secilen);
		
	}

}
