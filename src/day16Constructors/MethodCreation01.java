package day16Constructors;

public class MethodCreation01 {

	public static void main(String[] args) {
		/*
		 Method olustururken "Void" disinda bir return type kullanirsaniz.
		 Method body'si icinde en son satirda "return" keyword kullanmalisiniz. aksi halde Compile Time Error alirsiniz.
		 
		 "void" disinda kullanilabilecek return type'lar tum primitive ve tum non-primitiv'lerdir.
		 */

		System.out.println(add(3, 5));
		
		System.out.println(concatenate ("Merhaba ", "Dunya"));
	}

	public static int add(int a, int b) {
		
		
		return a+b;
	}
	
	// iki stringi concatenate eden ve string return eden bir method olusturunuz.
	// bu method;u main method icinden cagirip String'i ekrana yazdirin.
	
	public static String concatenate(String s, String t) {
		
		return s.concat(t);
	}
	
}
