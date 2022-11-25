package day11stringmethods;

public class String01 {

	public static void main(String[] args) {
		/*
		 
		 */

		//15. substring(beginIndex)  // beginIndex baslangic index i demek
		String s1 = "Java OOP languagedir"; 
		System.out.println(s1.substring(3)); // a OOP languagedir
		System.out.println(s1.substring(5)); // OOP languagedir
		
		//son harfi yazdirin,
		System.out.println(s1.substring(s1.length()-1)); //r
		
		
		// beginIndex , endIndex baslangic ve bitis index i ni girdigimiz aradaki kelimeyi verir 
		System.out.println(s1.substring(9, 17)); // language  // 9 dahil 17 haric alir 
		
		// substring(0, 1) string return eder , charAt(0) char return eder. 
		// bu nedenle substring(0, 1) ile charAt(0) esittir DIYEMEYIZ.
		System.out.println(s1.substring(0, 1)); // Stringin ilk harfini verir charAt(0) gibi. 
		System.out.println(s1.substring(5, 5)); // index ler esit ise hic birsey almaz 
		
		// System.out.println(s1.substring(5, 2));
		// substring methodun da baslangic index i bitis index in den buyuk olamaz. olursa Run Time Error verir.  
		 
		
		
		
		//16. trim() methodu 
		String s2 = "     Java ogrenen diger dilleri cabuk ogrenir    "; 
		// trim() tras etmek kirpmak anlamina gelir.
		// trim() methodu bir stringin bas ve sonundaki space leri siler. aralardakini silmez
		System.out.println(s2); // trim() kullanmadan once "     Java ogrenen diger dilleri cabuk ogrenir    "
		System.out.println(s2.trim()); // trim() kullaninca "Java ogrenen diger dilleri cabuk ogrenir"
		
		
	}

}
