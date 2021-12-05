package day32_varrags_stringBuilder;

public class C01_Immutable {

	public static void main(String[] args) {
		String s = "Hello";
		
		String t = new String (s);
		
		if ("Hello"==s) {
			System.out.println("four");
		}
		if ("Hello"==t) {
			System.out.println("five");
		}
	}

}
