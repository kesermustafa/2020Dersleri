package day18StaticBlockarrays;

import java.util.Arrays;

public class Arrays01 {
	
	int x = 12;
	/*
	 1 - Array ler birden fazla degeri depolamak icin kullanilabilir.
	 2 - Array lere konulan degerlerin Data Type lari ayni olmalidir.
	 3 - Array olusturuken mutlaka kac eleman yerlestirecegimizi belirtmemiz gerekir.
	 4 - Array lerde sadece a) primitive ve b) referance'lar depolanabilir.
	 */
	
	public static void main(String[] args) {
		// Array olusturmak
		int a[] = new int [4];
		
		// Arrays console yazdirmak 
		System.out.println(Arrays.toString(a)); // [0, 0, 0, 0] 
		
		// Array'e eleman eklemek; 
		a[0]=8;
		a[2]=15;
		a[3]=8;
		System.out.println(Arrays.toString(a)); 
		a[1]=23;
		System.out.println(Arrays.toString(a));
		
		//Array'de kac eleman oldugunu bulmak
		//Stringlerde kullandigimiz length()'dir.   Array'lerde kullandigimiz length'dir. Yani parantez yok
		System.out.println(a.length);
		
		//String array olusturunuz.
		String b [] = new String [3];
		System.out.println(Arrays.toString(b));
		
		b[0] = "Ali";
		b[1] = "Can";
		b[2] = "Gel";
		System.out.println(Arrays.toString(b));
		
		//Bir array'den spesifik elemani yazdirmak.
		System.out.println(b[1]);
		System.out.println(b[0]);
		System.out.println(b[2]);
		
		//b array indeki elemanlari alt alta console yazdir.
		for (int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		// a array'indeki elemanlari ayni satira onlerine yildiz koyarak tersten yazdiriniz.
		for (int i = a.length-1; i>=0; i--) {
			System.out.print(" *" + a[i]);
		}
		
		
		System.out.println();
		// a array'inde index'i cift olan elemanlari yazdiriniz.
		
		for (int i = 0; i<a.length; i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
			
		}
		
		//Array deki elemanlari kucukten buyuge (ascending order) siralamak 		
		// a array'indeki elemanlari kucukten buyuge (ascending order) siralamak
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		//sort methodunu b array icin kullanin
		//sort methodu string arraylarde alfabetik siralama yapar.
		//Javada kucukten buyuge siralama alfabetik siralama yerine "Natural Order" kullanilir.
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		
	}
}
