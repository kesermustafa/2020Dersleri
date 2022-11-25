package day12forloop;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 5'den 12'e kadar tum tam sayilarin toplamini hesaplayip ekrana yazdiran programi yapiniz. 
		 */

		int toplam = 0;
		
		for(int i=5; i<=12; i++) {
			toplam = toplam + i;
		}
		System.out.println("Toplam: " + toplam);
	}

}
