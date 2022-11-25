package day15variabletypeMethodCreation;

public class VariableTypes {
	
	/*					INSTANCE VARIABLE
	 1) Main method'un ve urettigimiz diger method'larin disinda (ustunde veya altina), class icinde olusturulan variable'lara "instance variable" denir.
	 
	 2) Instance variable'lar obje olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
	 3) Instance variable'lara deger atamasi yapsanizda olur yapmasaniz da olur.
	    Asagida goruldugu gibi i variable'na deger atamasi yaptim, k variable'a yapmadim.
	    Note: bir variable deger atamasi yapmaya "initialize" olarak adlandirirlir.
	          "i"  variable'i initialize edildi, digerleri initialize edilmedi.
	 4) Initialize edilmeyen Ïnitialize variable"lar icin Java kendisi deger atar.
	 
	 	Java'nin initialize variable'lara kendisinin verdigi degerlere "default vaule" denir.
	 	byte.,  short, int, long icin default value 0'dir.
	 	float, double icin default value 0.0'dir.
	 	char icin default value 0'dir.
	 	boolean icin default value  false'dur.
	 	String icin default value null'dir.
	 */
	
	int i = 12;
	int k;
	String s;
	boolean b;
	double d;
	char c;
		
	/*				LOCAL VARIABLE
	 	1) Main method'un veya olusturdugumuz baska method'un icinde olusturulan variablelara "Local variable" denir.
	 	2) Local variable'lara deger atamasi yapmak  zorundayiz aksi halde o variable'i kullanamayiz.
	 		Java Local Variable'lar icin default value atamasi yapmaz. 
	*/
	
	public static void main(String[] args) {
		int a = 13;
		System.out.println(a);
		
		int b=5;
		b++;
		System.out.println(b);
	}
}
