package day24varargsaccessmodifiers;

public class vrgs01 {

	public static void main(String[] args) {
		/*
		 1) Metod parantezi icinde 1'den fazla parametre varsa, varargs herzaman en sonunucu parametre olmalidir.
		 2) method parantezi icinde 1 den fazla varargs kullanilamaz. 
		 */

		add(3, 5);
		add(3, 5, 7, 10, 11 );
		add();
		
		concat("Ali", " G", "e", "l");
		yazdir("isim", "A", "l", "i");
	}
	
	public static void add(int...a) {
		int sum = 0;
		for(int w: a) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	
	//varargs verilen stringleri birlestiren concat isimli bir metod olusturunuz.
	
	
	public static void concat(String...str) {
		String toplam = "";
		for(String w : str) {
			toplam = toplam + w;
		}
		System.out.println(toplam);
	}
	
	public static void yazdir(String a, String...s) {
		System.out.println(a);
		for(String w : s) {
			System.out.print(w + " ");
		}
	}
	
	
	
	
}
