package day09switchstringmethods;

public class String01 {

	public static void main(String[] args) {
				
		// 1.charAt method
		String s1 = "StudyHardStayHumble";
		System.out.println(s1.charAt(0)); //charAt(0) index 0'daki karakter == S
		
		//7.harfi yazdir
		System.out.println(s1.charAt(6)); 
		
		// son harfi yazdir
		System.out.println(s1.charAt(s1.length()-1)); // son karakterin indexi = character sayisi -1 dir. s1.length()-1
		
		//ortadaki characteri ekrana yazdirin.
		if(s1.length()%2!=0) {
			System.out.println(s1.charAt((s1.length()-1)/2));
		}else {
			System.out.println("Orta character Yok");
		}
		
		// System.out.println(s1.charAt(38));
		
			//charAt() methodunda olmayan bir index kullandiginizda :
			// programi calistirdiktan sonra kirmizi HATA mesaji alirsiniz.
		
		/*
		 Javada temelde iki tur HATA mesaji vardir.
		 1 - Compile Time Error : code yazarken alinan KIRMIZI  Alt Cizgiler.
		 2 - Run Time Error : Yazilan kod calistirildiktan sonra consolda gorulen kirmizi mesajlardir. 
		 						Run Time Error olustugunda sonraki kodlar calismaz.
		 						Java kod calistirmayi (execution) durdurur,
		 		Consolun en sonunda hangi satirda hata yaptigimiz yazar.
		 */
		
		//2.concat  
		String s2 = "Ogreten ogrenir";
		System.out.println(s2.concat(" tamam mi?"));
		
		
		//3.contains METHODU icermek demektir boolean return eder.
		String s3 = "Java ogren zengin ol";

		System.out.println(s3.contains("J")); //true
		System.out.println(s3.contains("x")); //false
		System.out.println(s3.contains("ogren")); //true
		System.out.println(s3.contains("")); //true
		
		
		
	}

}
