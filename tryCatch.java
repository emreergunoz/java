package hatayakalama;

public class tryCatch {

	public static void main(String[] args) {
		
		try {
			int a = 19/ 0; // 0 a b�lme hatas� i�in deneme
			
		} catch (ArithmeticException e) { // matamatiksel hata i�in  ariteticexecptioon
			System.out.println("B�len 0 olamaz !");// hatay� yakalad���nda alaca��m�z hata mesaj�
			System.out.println("Hata t�r� : " + e.getMessage());// hangi t�rde hata ald���m�z
		}

	}

}
