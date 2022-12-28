package Ornekler;

public class denemeler2 {
	static class  hayvan{  //superclass , ana class denir 
		static protected   String  a;
		protected static  String b;
	}
	static class dortayaklý extends hayvan{ //extend sayesinde ... clasýndan alýnacak diyoruz
		protected static String c;
	}
	static class otcul extends dortayaklý{
		protected static  String d;
	}
	public static void main(String[] args) {
		hayvan.a="serçe";
		hayvan.b="inek";
		dortayaklý.c="aslan";
		otcul.d="koyun";
		System.out.println();
	
		}


	}


