package day20_scope;

public class instanceVar2 {

	String adres="Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;
	
	public static void main(String[] args) {
		//instance variable'lara main method'dan direk ulasilabilir mi? HAYIR
		//nasil ulasilabilir. OBJE OLUSTURARAK
		
		instanceVar2 ali = new instanceVar2();
		System.out.println(ali.adres);//Ankara 
		System.out.println(ali.dogumYeri);//null
		System.out.println(ali.notOrtalamasi);//0.0
		System.out.println(ali.yasOrt);//12.3
		System.out.println(ali.cinsiyet);//E
		System.out.println(ali.karakter);//space
		System.out.println(ali.ogrenciMi);//true
		System.out.println(ali.izinliMi);//fals
		
	
	
	
	}
	
	public static void staticMethod(){
		//instance variable'lara static method'dan direk ulasilabilir mi? HAYIR
		//nasil ulasilabilir. OBJE OLUSTURARAK
		
		
	}
	
	
	public  void staticOlmayanMethod(){
		//instance variable'lara static olmayan method'dan direk ulasilabilir mi? EVET
		
		
		
	}
	
	
	

}
