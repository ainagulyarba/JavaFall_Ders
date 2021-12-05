package day28__ConstructorCall_StaticKeyword;

public class C03 {

	public static void main(String[] args) {
		// Java Run time bir programdir
		// Run tusuna bastigimizda Java calismaya baslar ve islemeri baslar
		// Java'nin isi bittiginde  (calisma tusu kirmizidan griye dondugunde)
		// hersey basa doner
		
		//  static variable ve method'lar bulunduklari class ile ilintilidir(obje ile degil class ile!!!!!!!!!!!!
		// dolayisiyla baska bir class'ta iken C02'deki static variable veya method'a ulasmak istedigimizde 
		// C02.staticVariableIsmi ve C02.staticMethodIsmi() yazmamiz yeterli olur
		
		
		
				C02 obje1 = new C02();
				
				System.out.println("obje1 icin x: "+ obje1.x + " obje1 icin y: "+ C02.y);//x:5 y:10
				
				obje1.x++;
				C02.y++;
			    
				// static bir variable' a class ismi uzerinden ulasmak yerine
				//instance variable"lar gibi obje ile ulasmaya calisirsaniz
				//Java CTE vermez ama solda ! isareti ile bizi uyarir
				//"static bir field olan C02.y'ye static yoldan ulas" der
				
				System.out.println("obje1 icin x: "+ obje1.x + " obje1 icin y: "+ C02.y);//x:6 y:11
				
				
				C02 obje2 = new C02();
				
				System.out.println("obje2 icin x: "+ obje2.x + " obje2 icin y: "+ C02.y);//x:5 y:11
				
				obje2.x++;
				C02.y++;
				
				System.out.println("obje2 icin x: "+ obje2.x + " obje2 icin y: "+ C02.y);//x:6 y:12
				
				
				System.out.println("obje2 olusturulduktan ve islemden sonra obje 1'in "
						+ "x :"+ obje1.x + "  y :" + C02.y);//x:6 y:12
				
				C02 obje3 = new C02();
				
				obje3.x=20;
				C02.y=40;
				
				System.out.println("obje3 'ten sonra obje1 x: "+ obje1.x);//6
				System.out.println("obje3 'ten sonra obje2 x: "+ obje2.x);//6
				System.out.println("obje3 'ten sonra obje3 x: "+ obje3.x);//20
				
				System.out.println("obje3 'ten sonra obje1 y: "+ C02.y);//40
				System.out.println("obje3 'ten sonra obje2 y: "+ C02.y);//40
				System.out.println("obje3 'ten sonra obje3 y: "+ C02.y);//40
				
				
				
		
		
		
		
		
		

	}

}
