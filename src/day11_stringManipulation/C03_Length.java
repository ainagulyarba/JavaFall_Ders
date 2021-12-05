package day11_stringManipulation;

public class C03_Length {

	public static void main(String[] args) {
		String str1="Ali Kahyaoglu";
		
		System.out.println(str1.length()); //13
		
		//verilen str1'in son harfini yazdirin
		System.out.println(str1.charAt(str1.length()-1)); //u
		
		
		String str2="";
		System.out.println(str2.length()); //0
		
		String str3=null ;
		//System.out.println(str3.length()); //java.lang.NullPointerException
		
		String str4;
		
		System.out.println(str3);//null degeri bizim bu veriable'i bilerek olusturdugumuzu
							// ve bilerek deger atamadigimizi belirtiyor
		//System.out.println(str4);
		
	//null pointer olusturdugumua fakat sonra kullanacagimiz bir String isaretlemek icin kullanilir
	//bir String'i yazdirdigimizda null cikiyorsa turkce olarak
	//"ben bu degiskeni olusturdum ama henuz deger atamadin"demek istiyor
	
	}

}
