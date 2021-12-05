package day12_stringManipulation;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		String str = "*Java 98ogrenmek c..ok k876olay";
		
		// replaceAll method'lari kullanarak Java ogrenmek cok kolay
		
	str=str.replaceAll("\\d", "");//rakamlari siler
	System.out.println(str);

	str =str.replaceAll("\\s", "x");// her kelimenin arasina "x" getirir
	System.out.println(str);
	
	str =str.replaceAll("\\W", "");// harfleri siler
	System.out.println(str);
	
	str = str.replace("x", " ");
	System.out.println(str);
	
	
	
	
	}

}
