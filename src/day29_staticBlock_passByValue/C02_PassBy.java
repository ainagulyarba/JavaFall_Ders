package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		
		// Biz 100 TL 'ye satilan bir urun icin 2 farkli indirim uygulayan iki method olusturalim
		
		int fiyat =100;
		
		indirimYap25(fiyat); //%25 indirimli fiyat
		System.out.println("Method'tan sonra main method'taki fiyat:"+fiyat);//100
		
		indirimYap25(fiyat);
		System.out.println("Method'tan sonra main method'taki fiyat:"+fiyat);//100
		
	}

	private static void indirimYap25(int fiyat) {
		
		fiyat*=0.75;
	
		System.out.println("%25 indirimli fiyat : " + fiyat);}

	
	private static void indirimYap10(int fiyat) {
		
		fiyat*=0.90;
		
		System.out.println("%10 indirimli fiyat : " + fiyat);
	}

}
