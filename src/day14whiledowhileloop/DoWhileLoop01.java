package day14whiledowhileloop;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		/*
		 while loop ile Do While Loop farki 
		 
		 1. while loop kullanirsaniz Java once sarti kontrol eder sonra loop booy'si icindeki kodu calistirir.
		 do-while loop kullanirsaniz Java once loop icindeki kodu calistirir. sonra sarti kontrol eder.
		 
		 2. while loop kullanirsaniz loop body icindeki kod bazen hic calismaya bilir..
		 	fakat do-while icindeki kod enaz bir kere calisir.
		 	
		 	Not: do-while loop oyun programlari icin iyidir.
		 */

		
		
		int i = 1;
		
		while(i<1) {
			System.out.println("While Loop");
			i++;
		}
		
		
		int k = 1;
		
		do {
			System.out.println("Do-While Loop");
			k++;
		}while(k<=1);
		
	}
}
