package timerornek;

import java.util.Timer;
import java.util.TimerTask;

public class timerornek1 {
	static int sayac = 0 ;

	public static void main(String[] args) {
		//timer 
		//belirli zamanda belirli iþlemi yapmak
		
		Timer myTimer = new Timer();
		
		TimerTask gorev = new TimerTask() {
		
			@Override
			public void run() { //standart çalýþtýrmý methodunu ptal edip timer ile çalýþtýrýyor
				sayac++; //sayac-- olursa 1 azalýyor
				System.out.println(sayac);// 10-sayac dersek 10 dan sayacý çýkarcaðý için geri geri gitmiþ olur
				if(sayac==10) myTimer.cancel();//belirli yere duruduma komutu koyuyor eðer gorev.cancel olursa belirtilen görev durur
						//kendisine baðlý bütün task larý durdurur
				/*sayac++; 
				System.out.println(10-sayac);  // bu þekilde olursa 10 dan gerri sayack yada sayac baþta 10 diyece sayac -- diyip sayacý ==0 ile durdurucaz
				if(sayac==10) myTimer.cancel();*/
			}
		};
		
		TimerTask gorev2 = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("ikinci görev çalýþlýyor");
				
			}
		};
		myTimer.schedule(gorev ,  0 ,1000);// üsttekinin hangi saniye(ms) aralýðý ile çalýþacaðýný  
								//kaç ms de baþlýyacak pna bakýyor ilk 0
		myTimer.schedule(gorev2,0,300);
	}

}
