package day28__ConstructorCall_StaticKeyword;

public class C02 {

	int x=5;
	static int y = 10;
	
	
	@SuppressWarnings("static-access")
	
	public static void main(String[] args) {
		
		//3 tane obje olusturalim ve degisimleri gozlemleyelim
		
		C02 obje1 = new C02();
		
		System.out.println("obje1 icin x: "+ obje1.x + " obje1 icin y: "+ obje1.y);//5 10
		
		obje1.x++;
		obje1.y++;
		
		System.out.println("obje1 icin x: "+ obje1.x + " obje1 icin y: "+ obje1.y);//6 11
		//ayni class icinde iken static variable'lara ulasmak icin obje'ye ihtiyac yoktur
		//kullanirsak Java CTE vermez fakat "static variable'a static yoldan ulas " der
		
		C02 obje2 = new C02();
		
		System.out.println("obje2 icin x: "+ obje2.x + " obje2 icin y: "+ obje2.y);//5 11
		
		obje2.x++;
	    obje2.y++;
		
		System.out.println("obje2 icin x: "+ obje2.x + " obje2 icin y: "+ obje2.y);//6 12
		
		System.out.println("obje2 olusturulduktan ve islemden sonra obje 1'in "
				+ "x : "+ obje1.x+ "y : " + obje1.y);
		
		C02 obje3 = new C02();
		obje3.x=20;
		//obje3.y=40;
		
		System.out.println("obe3 'ten sonra obje1 x: "+ obje1.x);//6
		System.out.println("obe3 'ten sonra obje2 x: "+ obje2.x);//6
		System.out.println("obe3 'ten sonra obje3 x: "+ obje3.x);//20
		
		System.out.println("obe3 'ten sonra obje1 y: "+ obje1.y);//40
		System.out.println("obe3 'ten sonra obje2 y: "+ obje2.y);//40
		System.out.println("obe3 'ten sonra obje3 y: "+ obje3.y);//40
		
		
		
	}

}
