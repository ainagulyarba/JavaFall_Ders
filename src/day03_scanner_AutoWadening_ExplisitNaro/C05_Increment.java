package day03_scanner_AutoWadening_ExplisitNaro;

public class C05_Increment {

	public static void main(String[] args) {
		
		
		int sayi1=10;
		
		System.out.println(sayi1+=5); //15  
		//atama var
		// bu islem sayi1'in degerini 5 artirip sayi1'e assign ediyor
		//dolayisiyla sayi2'in degeri kalici olarak degisiyor
		
		
		System.out.println(sayi1); //15
		
		System.out.println(sayi1+12); //27
		
		System.out.println(sayi1); //15
		//atama yok
		
		sayi1++;
		// her ne kadar = isareti gorunmese de sayi1++ isleminde assign vardir
		//dolayisiyla deger kalici olarak 
		
		System.out.println(sayi1); //16
		
		
		

	}

}
