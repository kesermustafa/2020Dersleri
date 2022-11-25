package day04Scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alfabe'den bir harf gir");
		//kullanıcıdan aldığınız data type char ise aşağıdki kodu yazın.
		// (0) ilk karakter demek, (1) yazarsanız 2.harfi alır.
		char harf = scan.next().charAt(0);
		System.out.println(harf);
		
		scan.close();
	}

}
