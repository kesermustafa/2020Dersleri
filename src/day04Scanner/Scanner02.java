package day04Scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("isminizi girirniz");
		
		// Dada Type String olduğu zaman nextLine() methodu kullanın
		// Data Type String olduğu zaman next() methoduda kullanılabilir. 
		// ama next() methodu saadece ilk kelimeyi alır devanını almaz. 
		// nextLine() ise kullanıcının giediği Stringin tamamını alır.
		String name = scan.nextLine();
		
		System.out.println(name);
		
		scan.close();
				

	}

}
