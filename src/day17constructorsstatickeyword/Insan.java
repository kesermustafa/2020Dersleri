package day17constructorsstatickeyword;

public class Insan {

	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	public Insan() {
		this("Nurse", "Erkek");
		System.out.println("Parametresiz");
	}
	
	public Insan(String name) {
		this();
		System.out.println("Name parametreli");
	}
		
	public Insan(String job,String gender ) {
		System.out.println("Job ve Gender parametreli");
	}
		
	
	public static void main(String[] args) {
		 Insan i1 = new Insan("Ahmet");
		
		
	}
}
