package timerornek;

import java.util.Timer;
import java.util.TimerTask;

public class timerornek1 {
	static int sayac = 0 ;

	public static void main(String[] args) {
		//timer 
		//belirli zamanda belirli i�lemi yapmak
		
		Timer myTimer = new Timer();
		
		TimerTask gorev = new TimerTask() {
		
			@Override
			public void run() { //standart �al��t�rm� methodunu ptal edip timer ile �al��t�r�yor
				sayac++; //sayac-- olursa 1 azal�yor
				System.out.println(sayac);// 10-sayac dersek 10 dan sayac� ��karca�� i�in geri geri gitmi� olur
				if(sayac==10) myTimer.cancel();//belirli yere duruduma komutu koyuyor e�er gorev.cancel olursa belirtilen g�rev durur
						//kendisine ba�l� b�t�n task lar� durdurur
				/*sayac++; 
				System.out.println(10-sayac);  // bu �ekilde olursa 10 dan gerri sayack yada sayac ba�ta 10 diyece sayac -- diyip sayac� ==0 ile durdurucaz
				if(sayac==10) myTimer.cancel();*/
			}
		};
		
		TimerTask gorev2 = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("ikinci g�rev �al��l�yor");
				
			}
		};
		myTimer.schedule(gorev ,  0 ,1000);// �sttekinin hangi saniye(ms) aral��� ile �al��aca��n�  
								//ka� ms de ba�l�yacak pna bak�yor ilk 0
		myTimer.schedule(gorev2,0,300);
	}

}
