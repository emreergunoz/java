package algoritma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class arraylistOrnek {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		Scanner scan = new Scanner(System.in);		

		System.out.println("Kaç harfli string : ");
		int harfsayisi = scan.nextInt();

		System.out.println("Kaç adet string : ");
		int stringsayisi = scan.nextInt();

		//Ascii kodlar A=65, B=66, ..... Z=90

		int i,j;
		String s = "";
		Random r = new Random();
		int rsayi;

		for(j=0;j<stringsayisi;j++) {
			for(i=0;i<harfsayisi;i++) {
				rsayi = r.nextInt(26)+65;
				s += (char)rsayi;
			}
			liste.add(s);
			s = "";
		}

		System.out.println(liste);

		Collections.sort(liste);
		System.out.println(liste);

		//A harfi vey E harfi ile baþlayan stringlerin sayýsýný bulduralým
		int sayac=0;
		for(i=0;i<liste.size();i++) {
			if(liste.get(i).charAt(0)=='A' || liste.get(i).charAt(0)=='E') {
				sayac++;
			}
		}

		System.out.println("Baþ harfi A veya E olan "+ sayac + " string vardýr");


	}

}
