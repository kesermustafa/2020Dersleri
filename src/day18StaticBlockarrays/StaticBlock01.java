package day18StaticBlockarrays;

public class StaticBlock01 {

	static double pi;
	static String s;
	
	/*
	 1- Static block, static variable lara deger atamasi yapmak(initialize) icin kullanilir. 
	 2- Static block class olusturulurken butun metodlardan (main method dahil) once calistirilir. 
	 3- Birden fazla static block varsa usteki once calisir.
	 */

	static {
		System.out.println(pi = 3.14);
	}
	
	
		
	public static void main(String[] args) {
		alanDaire(10);
	}
	
	public static void alanDaire(double r) {
		System.out.println("Dairenin Alani: " + pi*r*r);
	}

	static {
		System.out.println(s = "Ali" + pi);
	}
	
	
}
