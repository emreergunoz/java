package hatayakalama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwException {
	
	static void ortalama(int v , int f ) {
		if (v<0 || f<0 || v>100 || f>100) { // 0 dan k���k yada 100 den buy�kseler 
			throw new ArithmeticException("Notlar 0-100 aras�nda olmal� ");// bu aral�kta girilmezse otomatik hata kodu olarak bunu vericek 
		} else { // b�yle bir hata yoksa alttaki i�lemi yap
			float ortalama =(float)(v*0.4 + f*0.6);// i�lemler yap�ld�r float a zorland�
			System.out.print("Ortalama = " + ortalama);
		}
	}

	public static void main(String[] args) {
		//Throp Exception 
		Scanner scan = new Scanner(System.in );
		int v,f;// �stteki blo�a veri g�ndericez
		try { // verileri al�caz
			System.out.print("Vize notunu giriniz : ");
			v= scan.nextInt();
			System.out.print("Final notunu giriniz : ");
			f= scan.nextInt();
			ortalama(v,f); //ortalama methoduna g�ndercez 
			
		} catch (InputMismatchException e) { // girilen veri hatas� 
			System.out.println("Say�sal veri giriniz");// e�er 0-100 aras�nda de�ilse �stteki �al��acak  say�sal veri girilmezse alttaki �al��acak
		}
	}

}
