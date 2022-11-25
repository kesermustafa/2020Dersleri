package day24varargsaccessmodifiers;

import day23foreachloopdatetime.AcMo03;

public class AcMo02 {
	
	/*
	 Privete class member lar sadece icinde bulunduklari class larda kullanuilabilirler.
	 Baska class lardan private class lari kullanmak mumkun degildir. 
	 2- Baska package lerden obje olusturusaniz object olusturulan class i import etmek gerekir.
	 3- Baska package lerden default class member lara ulasamazsiniz. Ayni package de iseniz ulasabililirsiniz.
	 	"Default" ile "package privite"  es anlamlidir.
	 4- Public class member lara herkes her yerden ulasabilir.
	 5- Protected class memberlara ayni package de iseniz ulasabilirsiniz. 
	 	Farkli package de iseniz iki durum var:
	 	
	 		a) Child class iseniz ulasabilirsiniz.
	 		b) Child class degil ise ulasamazsiniz.
	 		
	 6- Class'larda da access  modifier kullanilir. Ama sadece "public" ve "default" access modifier kullanilabilir.
	 	Class olustururken "private" veya "protected" modifier kullanmayiyiniz, 
	 */
	
	public static void main(String[] args) {
	
	AcMo01 obj1 = new AcMo01();
	
	
	System.out.println(obj1.publicAge);
	System.out.println(obj1.protectedAge);
	System.out.println(obj1.defaultAge);
	
	AcMo03 obj3 = new AcMo03();
	
	System.out.println(obj3.publicName);
	
	

		
		
		
	}

}
