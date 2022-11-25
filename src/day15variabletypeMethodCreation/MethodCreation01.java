package day15variabletypeMethodCreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		/*
		 Static method icinde kullanilan hersey static olmalidir.
		 */
		
		/*
		 Method olustururken ayni method isimlerini kullanabilirsiniz ama parametreler farkli olmalidir.
		 Parametreleri farkli yapmanin 3 yontemi vardir.
		 1- Parametre sayilarini farkli yapabilirsiniz.
		 2- Parametrelerin data type lerini degistirebiliriz.
		 3- Parametrelerin data type lari farkli ise data type larin  yerlerini degistirebiliriz. 
		 
		 */
		toplama(3, 5); 
		toplama(6.3, 1.2); 
		
		carpim(2, 3);
		carpim(2.3, 3.4);
		carpim(2, 3.5);
		carpim(4,5,6);
		
	}
	public static void toplama(double a, double b) {
		System.out.println(a+b); 
	}
	
	// iki double'i carpan carpma methodu create edin. Bu method'u main method icinden cagirarak calistirin.
	
	public static void carpim(double a, double b) {
		System.out.println(a*b);
		// method parantezi icindeki variable lara PARAMETRE denir.
		
		// ARGUMENT method cagiriken kullanilan sayilara denir.
	}
	
	public static void carpim(int a, double b) {
		System.out.println(a*b);
	}
	
	public static void carpim(int a, int b) {
		System.out.println(a*b);
	}
	public static void carpim(double a, double b, double c) {
		System.out.println(a*b*c);
	}
	
}
