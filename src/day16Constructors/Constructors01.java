package day16Constructors;

public class Constructors01 {

	/*
	 "Constructors" mutait demek, Constructors'lar ile obje uretecegiz.
	 
	 1- Constructor'in ismi class ismi ile ayni olmalidir. Bu Constructor olmanin sartidir.
	 2- Constructor olusturuken class ismi yazildiktan sonra parantez konulmalidir.
	 3- Class olusturldugunda java bu class dan obje olusturulacgini dusunerek (default) Constructor olusturulur.
	    bu Constructor a "default constructor" denir. 
	 4- Siz kendiniz constructor urettigimizde java default constructor i iptal eder.
	 5- constructor ureterek bir class dan cok farkli objeler uretebiliriz. 
	 6- Constructor'lar da return type yoktur. bu yuzden Constructor lar Method degillerdir.
	 	Constructor'lar => Constructor lar
	 7- Constructor'lar da sadece class ismi isim olarak kullanilabilir fakat method larda isim olarak hersey kullanilabilir.
	 */
	
	public Constructors01() {
	}
	
	public static void main(String[] args) {
		
		//Class ismi   obje ismi	new Keyword		Constructor
		Constructors01   ob01     =   new 		  Constructors01();
									 
		System.out.println(ob01);
	}
}
