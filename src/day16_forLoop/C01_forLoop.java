package day16_forLoop;

public class C01_forLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.print(i + " ");
	
		}
		
		//for loop baslangic ve bitis sarti bir sayinin degerine bagli olan 
		//durumlarda tercih edilir
		
	//	for (int i = 0; i < 10; i--) {
	//		System.out.println(i + " ");
		// buna sonsuz dongu denilir,cunku -1,-2,-3,-4.......bitmez
			//eger baslangic sayisi artis/azalis ile bitis degerine yaklasmiyor uzaklasiyor ise
			//loop hic bir zaman durmaz
		
		for (int i = 0; i > 10; i++) {
			System.out.println(i + "acaba calisir mi?  ");
			//olu dogmustur)))
			//eger ilk deger icin bitis sarti true olmazsa 
			//daha ilk adimda (loopta) loop broken olur
			//dolayisiyla loop body hic calismadan,loop'un sonrasina gecirilir
			//loop CALISIR,ama hic bir islem YAPMAZ
		}
		
		
		
	}

}
