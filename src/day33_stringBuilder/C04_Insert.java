package day33_stringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
	
		
		StringBuilder sb = new StringBuilder("Java ogrendik");

		//araya "cok iyi" ekleyelim
		
		sb.insert(4, "yi cok iyi");// eklemek
		
		System.out.println(sb);//Javayi cok iyi ogrendik
		
		
		
		String str2 = "cok iyiyim";
		
		sb.insert(7, str2, 0, 4);
		
		System.out.println(sb);
		
		// replace(); => yerini degistir
		// reverse(); => tersine yazdirir
		
		
		
		
	}

}
