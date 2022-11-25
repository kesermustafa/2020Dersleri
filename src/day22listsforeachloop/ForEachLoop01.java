package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		/*
		 1- For-each loop: for-loop'un gelistirilmis halidir.
		 	Yazmasi kolay
		 	okumasi kolay
		 	hata yapma ihtimali daha az.
		 */
		
		//integer List olusturun, elemanlari 1 er 1 er ayni satira aralarina bosluk birakarak yazdirin.
		List<Integer> ls = new ArrayList<>();
		ls.add(3);
		ls.add(2);
		ls.add(1);
		ls.add(5);
		ls.add(4);
		
		//for-loop
		for(int i=0; i<ls.size(); i++) {
			System.out.print(ls.get(i)+ " ");
		}
		System.out.println();
		
		//for-each loop
		for(Integer w : ls) {
			System.out.print(w + " ");
		}
		System.out.println();
		
		//for each loop kullanarak ls listdeki tum elemanlarin toplamini bualan
		int toplam=0;
		
		for(Integer w : ls) {
			toplam = toplam + w;
		}
		System.out.println(toplam);
		
		//ilk iki eleman haric diger elemanlari yazdirin
		for(Integer w : ls.subList(2, ls.size())) {
			System.out.print(w + " ");
		}
		System.out.println();
		
		//Index'i 1 olan elemandan index'i 3 olan elemana kadar tum elemani yazdirin
		for(Integer w : ls.subList(1, 4)) {
			System.out.print(w + " ");
		}
		System.out.println();
		
		//ls listindeki elemanlardan tek sayi olanlari yazdirmayin.
		//1.yol
		for(Integer w : ls) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
		}
		System.out.println();
		
		//2.yol
		for(Integer w : ls) {
			if(w%2!=0) {
				continue;  // GEC ONU DEMEK 
			}
			System.out.print(w + " ");
		}
		System.out.println();
		
		//ls listindeki elemanlari 5 gorunceye kadar yazin
		
		for(Integer w : ls) {
			if(w==5) {
				break;
			}
			System.out.print(w + " ");
		}
		
		// NOT ; continue; bazi elemanlari islem disi tutmak icin kullanilar.
		//		break; ise belli sartlara gore loop u kirmak icin kullanilir.
		
		System.out.println();
		
		// 5 den kucukleri yazdir. 
		
		for(Integer w : ls) {
			if(w<5) {
				System.out.print(w + " ");
			}
		}
		
	}
}
