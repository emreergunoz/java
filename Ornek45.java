package Ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ornek45 {
	public static void main(String[] args) {
		ArrayList<String>  a= new ArrayList<>();
		a.addAll(Arrays.asList(new String[] {"Pazartesi","Sal�","�ar�amba","Per�embe","Cuma","Cumartesi","Pazar"}));
		int b,c;
		String q;
		String r;
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Haftan�n Ka��nc� G�n�n� Seviyorsunuz ?");
			b=(s.nextInt()-1);
			q=a.get(b);
			System.out.println("Haftan�n Ka��nc� G�n� Sevmiyorsunuz ? ");
			c=(s.nextInt()-1);
			r=a.get(c);
			System.out.println("Haftan�n Sevdi�iniz G�n� : " + q+ ","
			+"Haftan�n Sevmedi�iniz G�n� : " + r );
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Haftan�n 7 G�n� vard�r !");
			throw new IndexOutOfBoundsException("Liste ta�ma hatas�");
		} catch (InputMismatchException w) {
			System.out.println("L�tfen say� giriniz !");
		} finally{
			System.out.println("��lem Tammaland�.");
		}
			
	
	}

}
