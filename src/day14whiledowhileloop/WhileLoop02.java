package day14whiledowhileloop;

public class WhileLoop02 {

	public static void main(String[] args) {
		/*
		 3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ekrana yainiz.
		 Bu sayilarin kac tane oldugunu da ekrana yazdirin.
		 */

		
		int i = 999;
		
		int counter = 0;  //Flag 
		
		while (i>=100) {
			if (i%4==0 && i%6==0) {
				System.out.print(i + " ");
				counter++;
			}
		
		i--;
		}
		System.out.println();
		System.out.println("4 ve 6 ya bolunen : " + counter + " tane sayi vardir.");
		
	}

}
