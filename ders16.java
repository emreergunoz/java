package VideoDers;

class Ogrenci1{
	private String ad;
	private String soyad;
	private int yas;
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		if(yas>0) this.yas = yas; 
		else System.out.println("Yaþ sýfýrdan küçük olmaz!");
	}
	
	
}


public class ders16 {

	public static void main(String[] args) {
		
		Ogrenci1 ogr1 = new Ogrenci1(); //object object yada instance
		
		ogr1.setAd("Yasin");
		System.out.println(ogr1.getAd());
		
		ogr1.setYas(5);

	}

}
