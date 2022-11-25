package day03ifstatement;

public class Operations01 {

	public static void main(String[] args) {
		
		int harf = 'a';
		System.out.println(harf); // 97 
		
		int unlem ='!';
		System.out.println(unlem); // 33 
		
		//java  matematikteki tum islemleri doğru olarak yapar.
		
		
		int a = 10;
		int b = 11;
		int c = 47;
		
		System.out.println(a+b);
		System.out.println(c / a); //47/10 = 4,7 vermez 4 cikar 
		//Java yuvarlama işlemi yapmaz.
		//tam sayı (integer) tam sayı ya bbölünnünce sonucun tam sayı kısmını (integer) verir.
		
		/*
		 İşlem önceliği:
		 1-parantez içi işlemler önce yapılır.
		 2-çarpma ve blmeler yapılır.
		 3-toplama ve çıkarmalar yapılır.
		 */
		System.out.println(b+a*c);
		System.out.println(b+(c-2*b)/2);
		System.out.println(c-a/(b-c)+a*b);
		
		//Farklı dta tipleri ile matematiksel işlem yaoarsnız sonuc büyük data type tapinde verilir.
		//byte < short < int < long < float < double 
		int d = 12;
		double e = 4;
		float f = 4f;
		
		System.out.println(d / e);
		System.out.println(d + e);
		System.out.println(e / d);
		System.out.println(f / d);
		
		//Modulus islemi: iki ondalık olmayan sayı birbirine bölündüğünde kalanı verir,
		//            Javada Modulus isleminin sembolü % dir.
		
		System.out.println(13 % 5);
		System.out.println(245 % 3);
		
		
		//Cift sayı (Even) : 2'ye bolundugunde 0 kalanı veren sayıdır.
		//Tek sayı (Odd) : 2 ye bolundugünde 1 kalnını veren sayıdır.
		
		System.out.println(1234567 % 2); // sonuc 1 ise tek sayıdır, sıfır ise çift sayıdır. 
		
		//Concatenation islemi: Stringleri birlestirmek için kullanılır.
		
		String s1 = "Java";
		String s2 = "kolaydir.";
		System.out.println(s1 + " " +s2);
		
		int g = 2;
		int h = 3;
		String i = "Java";
			
		System.out.println(i + g + h);
		System.out.println(i + (g + h));
		System.out.println(g + h + i);
		
		//g h ve i variable kullanarak ekrana 61Java-1 yazdır.
		
		System.out.println((g*h) + "" + (h-g) + i + (g - h));
		
		
		
		
		
		
		
	}

}
