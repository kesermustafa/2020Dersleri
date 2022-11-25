package day17constructorsstatickeyword;

public class StaticKeyWord01 {

	/*
	 1-Clasin icinde metodlarin disinda olusturulan variable lara "Instance Variable" denir.
	   Clasin icinde metodlarin disinda olusturulan static variable lara "Class Variable" denir.
	 2-Instance variable lar gibi Class varable lar icinde default degerler vardir.
	 3-Static variable lara ulasmak icin obje olusturmaya gerk yoktur.
	 	Instance variable lara ulasmak icin object olusturmak zorundayiz
	 	   ESANLAMLI
	 	Static variable = Class Variable
	 	Instance variable = object variable 
	 
	 */
	
	int i;
	static int k; 
	String name = "Ali";
	static String gender = "Erkek";
	
	
	public static void main(String[] args) {
		StaticKeyWord01 mc = new StaticKeyWord01();
		mc.i=5;
		mc.name="Ali";
		mc.k=1;
		System.out.println(k);
		System.out.println(mc.i);
		
	}

}
