package Set;

import java.util.HashMap;
import java.util.Scanner;

public class MapSay�ornek {

	public static void main(String[] args) {
		HashMap<Integer, String> birler=new HashMap<>();
		HashMap<Integer, String> onlar=new HashMap<>();
		HashMap<Integer, String> yuzler=new HashMap<>();
		Scanner s = new Scanner(System.in);
		birler.put(0, "");
		birler.put(1, "bir");
		birler.put(2, "iki");
		birler.put(3, "��");
		birler.put(4, "d�rt");
		birler.put(5, "be�");
		birler.put(6, "alt�");
		birler.put(7, "yedi");
		birler.put(8, "sekiz");
		birler.put(9, "dokuz");
		onlar.put(0, "");
		onlar.put(1, "on");
		onlar.put(2, "yirmi");
		onlar.put(3, "otuz");
		onlar.put(4, "k�rk");
		onlar.put(5, "elli");
		onlar.put(6, "altm��");
		onlar.put(7, "yetmi�");
		onlar.put(8, "seksen");
		onlar.put(9, "doksan");
		yuzler.put(0, "");
		yuzler.put(1, "y�z");
		yuzler.put(2, "ikiy�z");
		yuzler.put(3, "��y�z");
		yuzler.put(4, "d�rty�z");
		yuzler.put(5, "be�y�z");
		yuzler.put(6, "alt�y�z");
		yuzler.put(7, "yediy�z");
		yuzler.put(8, "sekizy�z");
		yuzler.put(9, "dok�zy�z");
		
		System.out.print("�� Basamakl� Veri Giriniz : ");
		String ss = s.next();
		int y= Integer.parseInt(Character.toString(ss.charAt(0)));
		int o= Integer.parseInt(Character.toString(ss.charAt(1)));
		int b= Integer.parseInt(Character.toString(ss.charAt(2)));
		
		System.out.println(yuzler.get(y)+onlar.get(o)+birler.get(b));
		
		
	}

}
