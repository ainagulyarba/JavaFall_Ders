package day03_scanner_AutoWadening_ExplisitNaro;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		//preincrement ve postincrement sadece sayi++ veya sayi** yazimi ici, gecerlidir
		
		int sayi=10;
		
		sayi++;
		sayi++;
		sayi++;
		
		System.out.println(sayi); //13
		
		System.out.println(sayi++); // 13 bu satirda iki islem var
									// bir artirma, bir de yazdirma
		
		System.out.println(sayi);  // 14
		
		//once arttirmak sonra yasdirmak isterseniz ++sayi
		//once yazdirmak sonra arttirmak isterseniz sayi++
		
		System.out.println(++sayi); //15
		

		
	}

}
