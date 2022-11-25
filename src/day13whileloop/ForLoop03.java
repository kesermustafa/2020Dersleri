package day13whileloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
		           *
		          * *
		         * * *
		        * * * *
		       * * * * *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Olusturulacac ucgenin satir sayisini giriniz.");
		int s = scan.nextInt();
		
		for (int i=1 ; i<=s ; i++) {         // satirlar icin loop
			
			for (int k=s-1; k>=i ; k--) {    // Spaceler icin loop
				System.out.print(" ");
			}
			
			for(int m=1 ; m<=i ; m++) {      // * lar icin loop 
				System.out.print("+ ");
			}
			System.out.println();
		}
		scan.close();
	}
}
