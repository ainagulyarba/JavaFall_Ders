package day15_methodCreation;

public class C03_Method_Overloading {

	public static void main(String[] args) {
		
		// javada ayni isimde birden fazla method olur mu?
		//cevap: EVET
		// ayni isimde birden fazla method olursa Java hangisini calistiracagina nasil karar verir?
		//cevap: ismi ayni olan methodlarda oncelikle parametre sayisina bakar, 
		//sonra da parametre sayisi ile arguman sayisi esit olanlardan 
		//arguman data turleri ile parametre data turleri arasinda uyuma bakar
		//tamamen uyusan varsa onu kullanir
		//tamamen uyusan yoksa kapsayan var mi bakar ve onu kullanir
		//birden fazla secenek oldugunda java her zaman en optimum olanini tercih eder
		
		topla(6,2,6,4);
		
	
	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("iki sayi toplami :" + (sayi1+sayi2+sayi3+sayi4));
		
	}

	private static void topla(double sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayi toplami dii:" + (sayi1+sayi2+sayi3));
		
	}

	private static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayi toplami :" + (sayi1+sayi2));
		
	}
	private static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayi toplami id:" + (sayi1+sayi2));
		
	}
	private static void topla(double sayi1, int sayi2) {
		System.out.println("iki sayi toplami di:" + (sayi1+sayi2));
		
	}
	
	private static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayi toplami dd:" + (sayi1+sayi2));
		
	}
}
