package day33_stringBuilder;

public class C06_SubSequence {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		

		System.out.println(sb.substring(14));//kolay
		
		System.out.println(sb.subSequence(14, 19));//kolay
		
		// ikisi de ayni sonucu dondurur
		// ancak substring () String Class'indan geldigi icin 
		// kullandigimda arkasindan String substring()'larini kullanabilirim
		// ancak subSequence kullandigimda bu mumkun degil
	
		
		sb.trimToSize();//capacity ile lenght'ini esitliyor
		
		System.out.println(sb);
	
	
	
	
	}

}
