package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int a[] = {2, 5, 2, 8, 6};
				
		// bir arrayda belli bir elmanin var olup olmadigini kontrol edecegiz.
		// binarySearch() methodu bir array'de belli bir elamanin var olup olmadigini kontrol etmek icin kullanilir.
		// binarySearch() methodunu kullanmadan once MUTLAKA sort() kullanmalisiniz.
		// sort() kullanmadan binarySearch() methodu kullanirsaniz buldugunuz sonuc manali olmaz.

		//binarySearch() methodu var olan elemanlar icin o elemanin sort edilmis array'deki index'i verir.
		// tekrarlanan elemanlar icin binarySearch() methodu kullanmiyoruz.
		//binarySearch() methodu Negatif sayi return ederse; kontrol ettiginiz sayinin arrayde bulunmadigi anlamina gelir.
		
		Arrays.sort(a); // [2, 2, 5, 6, 8]
		
		System.out.println(Arrays.binarySearch(a, 8));
		System.out.println(Arrays.binarySearch(a, 5));
		System.out.println(Arrays.binarySearch(a, 2)); // tekrarlanan elemanlar icin binarySearch() methodu kullanmiyoruz.
		
		System.out.println(Arrays.binarySearch(a, 4)); //-3 (4 yok ama olsaydi 3.eleman olurdu)
		System.out.println(Arrays.binarySearch(a, 7));
		System.out.println(Arrays.binarySearch(a, 9));
		
		
		// Iki array'in esit olup olmadigini kontrol etmek.
		// Iki array'in esit olabilmesi icin ayni ayni index'lerde ayni elemanlara sahip olmasi gerekir. 
		String s1[] = {"A", "B", "C"};
		String s2[] = {"A", "C", "D"};
		String s3[] = {"A", "C", "D"};
		
		System.out.println(Arrays.equals(s1, s2)); // false 
		System.out.println(Arrays.equals(s2, s3)); // true
		
		
		
		
		
	}

}
