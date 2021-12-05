package day32_varrags_stringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		String str = "Ali Can";
		
		String str2= new String("Veli Cem");
		
		StringBuilder sb = new StringBuilder("Yasasin Java");
		
		sb.append("!!!"); 
		
		str.toLowerCase();
		
		System.out.println(str);//Ali Can
		
		System.out.println(sb);//Yasasin Java!!!
		
		
		sb.toString().toUpperCase();
		System.out.println(sb);//Yasasin Java!!!
		
		String sbBuyukHarf = sb.toString().toUpperCase();
		System.out.println(sbBuyukHarf);//YASASIN JAVA!!!
		
	
		StringBuilder sb1 = new StringBuilder();//bos bir StringBuilder olusturur
		
		StringBuilder sb2 = new StringBuilder("animal");//belli bir degeri ooan StringBuilder olusturur
		
		StringBuilder sb3 = new StringBuilder(5);//ilk uzunlugu tahmin edilen bir StringBuilder olusturur
		
		
		
		System.out.println(sb.reverse());//!!!avaJ nisasaY
		
		
	}

}
