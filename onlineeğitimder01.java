package sorular;

import java.util.Scanner;

public class onlinee�itimder01 {
	
	public static boolean tekc�ft(float a) {
		if (a%2==0) return false;else return true;

	}
	// a mod 2 0 ise �ift olucak //�ift de�il ise tektir bu yuseden else if yerine else kulland�m 

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in); //say� almak i�in sacnner tan�mlad�m
		
		float a; //girilecek say�n�n s�n�rn� bilmedi�im i�in bildi�im en b�y�k say� tutan float � kullan�dm
		System.out.print("L�tfen bir say� giriniz :"); //Kullan�c�n�n say� girmesi gerekti�ini belirttim
		a= scan.nextFloat(); //girilecek say� a olcak dedim
		System.out.println(tekc�ft(a)); //burdanda �steki methoddan veri d�nece�i i�in methodun sonucunu yazd�rd�m
	}

}
