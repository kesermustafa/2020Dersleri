package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*
		 Elemanlarini kullanicinin verdigi bir string olusturun
		 Stringin tamami rakamlardan olussun
		 bu listin elemanlarinin carpimini ekrana yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		String str = "";
		List<String> list = new ArrayList<>();
		
		do {
			System.out.println("Rakamlardan olusan bir string giriniz.");
			System.out.println("String girmeyi durdurmak icin 'S' giriniz.");	
			str = scan.next();
			if(!str.equals("S")) {
				list.add(str);
			}
		}while(!str.equals("S"));
		System.out.println(list);
		
		int carpim = 1;
		for(int i=0; i<list.size(); i++) {
			
			carpim = carpim * Integer.parseInt(list.get(i));
						
		}
			System.out.println(carpim);
		
		scan.close();
		
	}

}
