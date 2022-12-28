package sorular;

import java.util.Scanner;

public class onlineeðitimder01 {
	
	public static boolean tekcýft(float a) {
		if (a%2==0) return false;else return true;

	}
	// a mod 2 0 ise çift olucak //çift deðil ise tektir bu yuseden else if yerine else kullandým 

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in); //sayý almak için sacnner tanýmladým
		
		float a; //girilecek sayýnýn sýnýrný bilmediðim için bildiðim en büyük sayý tutan float ý kullanýdm
		System.out.print("Lütfen bir sayý giriniz :"); //Kullanýcýnýn sayý girmesi gerektiðini belirttim
		a= scan.nextFloat(); //girilecek sayý a olcak dedim
		System.out.println(tekcýft(a)); //burdanda üsteki methoddan veri döneceði için methodun sonucunu yazdýrdým
	}

}
