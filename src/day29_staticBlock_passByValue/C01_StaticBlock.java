package day29_staticBlock_passByValue;

public class C01_StaticBlock {

	
	static {
		
		System.out.println("static block main method'tan bile once calisacak?");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Java'da once main method calisir");
	
	}
	
	static {
		
		System.out.println("static block nereye yazilirsa yazilsin main method'tan bile once calisacak?");
		
		
	}
	
	//eger birden fazla fazla static block varsa Java yukaridakini daha once calistirir
	
	
	
	
	
	
	}


