package Ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek45 {
	public static void main(String[] args) {
		ArrayList<String>  a= new ArrayList<>();
		a.addAll(Arrays.asList(new String[] {"Pazartesi","Salý","Çarþamba","Perþembe","Cuma","Cumartesi","Pazar"}));
		int b,c;
		String q;
		String r;
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Haftanýn Kaçýncý Gününü Seviyorsunuz ?");
			b=(s.nextInt()-1);
			q=a.get(b);
			System.out.println("Haftanýn Kaçýncý Günü Sevmiyorsunuz ? ");
			c=(s.nextInt()-1);
			r=a.get(c);
			System.out.println("Haftanýn Sevdiðiniz Günü : " + q+ ","
			+"Haftanýn Sevmediðiniz Günü : " + r );
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Haftanýn 7 Günü vardýr !");
			throw new IndexOutOfBoundsException("Liste taþma hatasý");
		} catch (InputMismatchException w) {
			System.out.println("Lütfen sayý giriniz !");
		} finally{
			System.out.println("Ýþlem Tammalandý.");
		}
			
	
	}

}
