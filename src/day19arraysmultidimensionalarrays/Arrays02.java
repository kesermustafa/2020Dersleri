package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// split() methodu
		// split = parcalamak demek.
		
		String s = "Calis bakalim zor mu?"; 
		
		String words1[] = s.split(" ");
		System.out.println(Arrays.toString(words1)); //[Calis, bakalim, zor, mu?]
		System.out.println("Kelime sayisi: " + words1.length);
		
		
		//"s" Stringinde kac karakter kullanilmistir. 
		
		String words2[] = s.split("");
		System.out.println(Arrays.toString(words2)); 
		System.out.println("Karakter sayisi: " + words2.length);
		
		//"s" Stringinde bosluk haric kac karakter kullanilmistir. 
		
		String words3[] = s.replace(" ", "").split(""); 
		System.out.println(Arrays.toString(words3)); 
		System.out.println("Karakter sayisi: " + words3.length);
		
		//"s" Stringinde kac tane a karakteri var.
		String words4[] = s.split("");
		int counter = 0;
		for(int i=0; i<words4.length; i++) {
			if(words4[i].equals("a")) {
				counter++;
			}
		}
		System.out.println("Sorulan character sayisi:" + counter);
		
		
		//bir String de kullanilan tum harflerin sayisini gosteren kodu yaziniz.
		// Alaaddin    A=1, l=1, a=3, d=2, i=1, n=1
		
		   // cozumu ; day20   interview soru videosu
		
		
	}

}
