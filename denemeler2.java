package Ornekler;

public class denemeler2 {
	static class  hayvan{  //superclass , ana class denir 
		static protected   String  a;
		protected static  String b;
	}
	static class dortayakl� extends hayvan{ //extend sayesinde ... clas�ndan al�nacak diyoruz
		protected static String c;
	}
	static class otcul extends dortayakl�{
		protected static  String d;
	}
	public static void main(String[] args) {
		hayvan.a="ser�e";
		hayvan.b="inek";
		dortayakl�.c="aslan";
		otcul.d="koyun";
		System.out.println();
	
		}


	}


