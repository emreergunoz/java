package hatayakalama;

public class tryCatch {

	public static void main(String[] args) {
		
		try {
			int a = 19/ 0; // 0 a bölme hatasý için deneme
			
		} catch (ArithmeticException e) { // matamatiksel hata için  ariteticexecptioon
			System.out.println("Bölen 0 olamaz !");// hatayý yakaladýðýnda alacaðýmýz hata mesajý
			System.out.println("Hata türü : " + e.getMessage());// hangi türde hata aldýðýmýz
		}

	}

}
