package day10_nestedTernary_SwitchCase;

public class SwitchCase3 {

	public static void main(String[] args) {
		// verilen sayiyi inceleyin
		// girilen sayi
		// 10 ise "iki basamakli en kucuk sayi"
		// 100 ise "uc basamakli en kucuk sayi"
		// 1000 ise "Dort basamakli en kucuk sayi"
		// diger durumlarda "girdigin sayiyi degistir" yazdirin
		
		int sayi = 10 ;
		
		switch (sayi) {
		
		case 10:
			System.out.println("iki basamakli en kucuk sayi");
			break;
		case 100:
			System.out.println("uc basamakli en kucuk sayi");
			break;
		case 1000:
			System.out.println("dort basamakli en kucuk sayi");
			break;
	
			default:
			System.out.println("girdigin sayiyi degistir");
						
		}
	}

}
