package day13whileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// For Loop kullanarak 1 den 5 e kadar tam sayilari ekrana yazdiriniz.

		// for icin
		// while iken
		
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(i);
		}
		
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		//while lopp kullanarak 10 dan kucuk sayma sayilarini ayni satirda yazdirin.
		int d=1;
		while(d<10) {
			System.out.print(d + " ");
			d++;
		}
		System.out.println();
		
		
		//while lopp kullanarak 50 dan kucuk cift sayilari ayni satirda yazdirin.
		
		int k=1;
		while(k<50) {
			if (k%2==0) {
				System.out.print(k + " ");	
			}
			k++;
		}
		System.out.println();
		
		
		//while lopp kullanarak "Java kolaydir" stringini tersden yazdirin.
		
		String s = "Java kolaydir";
		
		int n = s.length()-1;
		while (n>=0) {
			System.out.print(s.charAt(n));
			n--;
		}
		
		
	}
}
