package day10_nestedTernary_SwitchCase;

public class NestedTernary {

	public static void main(String[] args) {
		
		// Soru: Eger calısan kadınsa 60 yasından buyuk oldugunda emekli olabilir,
		// calısan erkekse 65 yasından buyukse emeklı olabilir.
		// her seferinde scanner olusturmak yerine 
		// test datalarimizi variable olarak ta olusturabiliriz
		// ve kod yazimi bittiginde bu test datalarini degistirerek 
		// kodlarimizi test edebiliriz
		
		char cinsiyet = 'K';
		int yas = 57;
		String sonuc = cinsiyet== 'K' ? (yas>=60 ? "emekli olabilirsin" : "emekli olamazsin"):
										(yas>=65 ? "emekli olabilirsin" : "emekli olamazsin");
		System.out.println(sonuc);
		

	}

}
