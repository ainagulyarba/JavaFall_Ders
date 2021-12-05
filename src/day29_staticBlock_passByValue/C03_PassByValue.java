package day29_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		
		//Main method'dan diger method'lara veya diger method'lardan main method'a 
		//bir variable gonderirseniz Java orijinal variable'lari degil
		//onlarin degerlerini(value) goturur, orijinal variable'in degeri degismez
			
			int fiyat =100;
			
		System.out.println(indirimYap25(fiyat));//75 
		
		System.out.println("Method'tan sonra main method'taki fiyat:"+fiyat);//100
			
		//indirimi kalici yapmak istiyorsaniz main method'da atama yapmamizgerekir
		
			fiyat=indirimYap10(fiyat);//90
			
			System.out.println("Method'tan sonra main method'taki fiyat:"+fiyat);//100
			
		
		}

		private static int indirimYap25(int fiyat) {
			
			fiyat*=0.75;
			return fiyat;
			
		}
		
		private static int indirimYap10(int fiyat) {
			
			fiyat*=0.90;
			return fiyat;
			
	}

}
