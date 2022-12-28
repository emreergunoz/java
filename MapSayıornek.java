package Set;

import java.util.HashMap;
import java.util.Scanner;

public class MapSayýornek {

	public static void main(String[] args) {
		HashMap<Integer, String> birler=new HashMap<>();
		HashMap<Integer, String> onlar=new HashMap<>();
		HashMap<Integer, String> yuzler=new HashMap<>();
		Scanner s = new Scanner(System.in);
		birler.put(0, "");
		birler.put(1, "bir");
		birler.put(2, "iki");
		birler.put(3, "üç");
		birler.put(4, "dört");
		birler.put(5, "beþ");
		birler.put(6, "altý");
		birler.put(7, "yedi");
		birler.put(8, "sekiz");
		birler.put(9, "dokuz");
		onlar.put(0, "");
		onlar.put(1, "on");
		onlar.put(2, "yirmi");
		onlar.put(3, "otuz");
		onlar.put(4, "kýrk");
		onlar.put(5, "elli");
		onlar.put(6, "altmýþ");
		onlar.put(7, "yetmiþ");
		onlar.put(8, "seksen");
		onlar.put(9, "doksan");
		yuzler.put(0, "");
		yuzler.put(1, "yüz");
		yuzler.put(2, "ikiyüz");
		yuzler.put(3, "üçyüz");
		yuzler.put(4, "dörtyüz");
		yuzler.put(5, "beþyüz");
		yuzler.put(6, "altýyüz");
		yuzler.put(7, "yediyüz");
		yuzler.put(8, "sekizyüz");
		yuzler.put(9, "doküzyüz");
		
		System.out.print("Üç Basamaklý Veri Giriniz : ");
		String ss = s.next();
		int y= Integer.parseInt(Character.toString(ss.charAt(0)));
		int o= Integer.parseInt(Character.toString(ss.charAt(1)));
		int b= Integer.parseInt(Character.toString(ss.charAt(2)));
		
		System.out.println(yuzler.get(y)+onlar.get(o)+birler.get(b));
		
		
	}

}
