package day21_scope_arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {
		
		int sayi = 10;
		
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi+" "+isim);
			
		}
		//System.out.println(isim);
		//System.out.println(i);
		
		//Loop icerisinde olusturulan variabl'lar Loop disinda kullanilamazlar
		//bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa
		//loop'tan once olusturur ve emniyette kalmak initialize yapariz

		
		for (int i = 0; i < 10; i++) {
			// int sayi =20; // sayi variable'i main method'un icinde olusturuldugundan tum main method'da
			//gecerlidir, dolayisiyla yeniden ayni isimde bir variable olusturamazsiniz
			
			String isim ="Veli"; // farkli scop oldugu icin burda yeni variable ayni isimde olusturabiliriz
								
			
			
		}
		
	}

}
