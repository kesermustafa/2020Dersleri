package day10stringmethods;

public class String01 {

	public static void main(String[] args) {
	
		// 4. endsWith "ile biter" 
		String s1 = "Testi al kendini gor";
		s1.endsWith("r"); // endsWith "ile biter"  // r ile bittigi icin // true 
		System.out.println(s1.endsWith("r")); // true
		System.out.println(s1.endsWith("gor")); //true
		System.out.println(s1.endsWith("kendini gor")); //true
		System.out.println(s1.endsWith("kendini")); // false

		
		
		//5. equals (esittir) demek 
		System.out.println("Ali".equals("Ali")); //true 
		System.out.println("Ali".equals("ALI")); //false 
		System.out.println("Ali"=="ALI"); // true 
		
		
		//6. equalsIgnoreCase (buyuk kucuk harf gormezden gel)
		System.out.println("ali".equalsIgnoreCase("Ali"));//true 
		
		
		//7. indexOf() "nin" eki  // i'nin index'i  
				// index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder.
		System.out.println(s1.indexOf('i')); // 4 aliriz. 
		System.out.println(s1.indexOf('T')); // 0 aliriz.
		System.out.println(s1.indexOf(' ')); // 5 aliriz.
		System.out.println(s1.indexOf("al")); // 6 aliriz.  // al kelimesinin ilk karakterin index'ini return eder. 
		System.out.println(s1.indexOf("x")); // -1 aliriz.  // olmayan character girildiginde -1 return eder. 
		
		//8. IndexOf(ch, fromIndex);  
		String s2 = "Cabuk ogrenilen cabuk unutulur;";
		System.out.println(s2.indexOf('a', 6));  // 17 aliriz
		System.out.println(s2.indexOf('r', 8));  // 8 aliriz		
		System.out.println(s2.indexOf("buk" , 5)); // 18 aliriz
		
		//9.isEmpty() (BOS MU)
			//isEmpty methodundan true aliyorsaniz o String icinde character yok demektir.
			// yani o Stringin length i 0 demektir.
		
		String s3 = "Tekrar et tekrar unutma";
		System.out.println(s3.isEmpty());   //FALSE
		System.out.println("".isEmpty());   //TRUE
		
		
		// 10. lastIndexOf()  SON  e nin  index i
		System.out.println(s3.lastIndexOf('e')); // 11 
		System.out.println(s3.lastIndexOf("rar")); // 13 yazar
		System.out.println(s3.lastIndexOf('r', 16)); // 15     ilk 16 karakterin sonunudan tersine giderek r nin karakterirnin index ini verir. 
		System.out.println(s3.lastIndexOf('k', 14)); //  12
		
		// 11. length() methodu bir stringdeki karakterlerin sayisini verir. 
		System.out.println(s3.length()); // 23
		
		// 12. replace () Karakter degistirmede kullanilir.
		System.out.println(s3.replace('e', 'E')); // TEkrar Et tEkrar unutma // istenilen karakteri buyuk/kucuk harf yapar 
		System.out.println(s3.replace('X', 'M')); // Tekrar et tekrar unutma // degistirilecek karakter yoksa hic bir sey yapmadan ayni stringi yazar
		System.out.println(s3.replace("krar", "miz")); //Temiz et temiz unutma // istenilen karakter sayisi yerine istenildigi karakter kadar karakter koyar 
		System.out.println(s3.replace("a", "")); // Tekrr et tekrr unutm // alari siler yerine bosluk koyar 
		System.out.println(s3.replace("", "|")); //|T|e|k|r|a|r| |e|t| |t|e|k|r|a|r| |u|n|u|t|m|a|

		
		//13
		
		String s4 = "Code1 yazarak2 ogrenilir3"; 
		/*
		 1)  \\d    Tum rakamlar  
		 	 \\D 	Tum rakam disi karakterler 
		 	 
		 2) \\w  ==>  A->Z    a->z    0->9 _   karakterlerinin tamamini icerir. 
		 	\\W  ==>  A->Z    a->z    0->9 _   bunlarin disidaki karakterlerinin tamamini icerir.
		 	
		 3) \\s  ==>  space 
		 	\\S  ==>  space disindaki her sey 
		 */
		
		System.out.println(s4.replaceAll("\\d", "*")); //Code* yazarak* ogrenilir*
		System.out.println(s4.replaceAll("\\D", "*")); //****1********2**********3
		System.out.println(s4.replaceAll("\\w", "*")); //***** ******** **********
		System.out.println(s4.replaceAll("\\W", "*")); //Code1*yazarak2*ogrenilir3
		System.out.println(s4.replaceAll("\\s", "*")); //Code1*yazarak2*ogrenilir3
		System.out.println(s4.replaceAll("\\S", "*")); //***** ******** **********
		
		
		// 14 startsWith ()   ...ile baslar.
		
		System.out.println(s4.startsWith("C")); //true
		System.out.println(s4.startsWith("c")); //false
		System.out.println(s4.startsWith("Code")); //true
		
		     //s4 stringinde 4.karakter e mi? 
		System.out.println(s4.startsWith("e", 3)); //true
		
	}

}
