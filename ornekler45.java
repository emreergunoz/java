package Ornekler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ornekler45 {
	public static ArrayList<String> b= new ArrayList<>();
	public static void tarama (int a) {
		if (a<0||a>6) {
			throw new IndexOutOfBoundsException("Liste ta�ma hatas�");
		}else {
			System.out.println(b.get(a));
		}
	}
	public static void main(String[] args) {
		int z;
		b.addAll(Arrays.asList(new String[] {"Pazartesi","Sal�","�ar�amba","Per�embe","Cuma","Cumartesi","Pazar"}));
		Scanner s = new Scanner(System.in);
		System.out.print("Bir say� giriniz : ");
		z=(s.nextInt()-1);
		tarama(z);
		
	}

}
