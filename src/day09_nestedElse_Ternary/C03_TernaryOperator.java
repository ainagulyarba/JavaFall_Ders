package day09_nestedElse_Ternary;

public class C03_TernaryOperator {

	public static void main(String[] args) {
		
		int x=10;
		String tekMiciftMi=x%2==0 ? "cift sayi": "tek sayi";
		System.out.println("tekMiCiftMi");
		System.out.println(x%2==0 ? "cift sayi": "tek sayi");
		
		// ternary iki turlu kullanilabilir
		// ya donen sonuca gore bir variable olusturup assing ederiz
		//veya direk syso icine yazip sonucu yazdiririz
		
		
		// eger ternary de donecek sonuclar ayni data turunden degilse
		// atama yapamayiz, sadece syso ile yazdirabiliriz
		System.out.println(x>5 ? "aferin" : 4); //aferin
				//String sonuc = x>5 ? "aferin" : 4
		

	}

}
