package day01variables;

public class Variables02 {

	public static void main(String[] args) {

		//Variables olusturma
		// 1-Data type yaz   2-Variable ismi  3- = isareti koy   4-Variable bir değer atamasi yap 5- ; koy
		
		//1.YOL   : Makbul (Recomended)
		int age = 51;
		int salary = 7750;
		
		System.out.println(age);
		System.out.println(salary);
		
		//2.YOL
		int length;   //Variable olusturuldu
		length = 12;  //Variable deger atandi
		System.out.println(length);
		
		//3.YOL
		// int width =22;
		// int height =32;
		// int money = 42;
		
		int width = 22, height=32, money=42;
		System.out.println(width + height + money);
		
		//bir class da ayni isimle sadece bir tane variable olusturulabilir.
		
		boolean emekli = false;
		boolean engelli = true;
		System.out.println(emekli);
		System.out.println(engelli);
		
		char initial = 'S';
		char ch1 = '?';
		char ch2 = 'a';
		char ch3 = ' ';
		char ch5 = 'A';
		// char ch6 ='' char oluşturuken tek tırnak arsında mutlaka l character olmalıdır.,
		// sıfır character veya 1 den fazla character kabul edilmez.
		
		System.out.println(ch5 > ch2);
		//karsilastirma işlemi yapığımızda sonucu ya true yada false olur.
		//yani boolean olur.
		//Büyük harflsrin ASCII değeri küçüktür.
		
		
		System.out.println(initial);
		
		System.out.println(ch5 > ch2);// karsilastırma isleminin sonucu true ya da false (boolean) olur.b
		
		byte b1 = 12;
		byte b2 = -125;
				
		System.out.print(b1*b2);
		System.out.print(ch3);
		System.out.println(ch1);
		System.out.println(initial + 0); // M'nin ASCII tablosu karsilik degeri 77 dir (77 + 0 = 77) 
		
		
		float f1 = 2.23f;
		float f2 = 0.1234F;
		
		double d1 = 2.23;
		
		//NON PRIMITIV 
		
		String str1 = "";
		String str2 = "A";
		String str3 = "Mustafa kursda";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("'Merhaba'");
		
		System.out.println(f1+f2+d1);
		
		Byte Byt1 = 25;
		System.out.println(Byt1);
		
		int harf = 'c';
		System.out.println(harf);
		
	}

}
