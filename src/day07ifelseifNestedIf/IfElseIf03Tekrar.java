package day07ifelseifNestedIf;

import java.util.Scanner;

public class IfElseIf03Tekrar {

	public static void main(String[] args) {
		/*
		 Kullanicidan notu alin ve asagidaki kuralara gore A B C ve D yazdirin;
		 1. 50'den az D   2. 50(dahil) ile 60 arasi C    3. 60 (dahil) ile 80 arasi B   4. 80(dahil) ile 100(dahil)  A
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Not'u giriniz");
		int Not = scan.nextInt();
		
		if(Not< 0) {
			System.out.println("Not gir dedik");
		}else if(Not<50) {
			System.out.println("D");
		}else if(Not<60) {
			System.out.println("C");
		}else if (Not<80) {
			System.out.println("B");
		}else if(Not<=100) {
			System.out.println("A");
		}else {
			System.out.println("Not gir dedik");
		}
		scan.close();
	}

}
