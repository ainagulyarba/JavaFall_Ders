package day11_stringManipulation;

public class C04_equalsIgnoreCase {

	public static void main(String[] args) {

		//equalsIgnorCase iki Stringi karsilastirirken 
		
		String str1= "ali";
		String str2="can";
		String str3= "Ali Can";
		String str4=str1+" "+str2; //ali can
		
		System.out.println(str4);//ali can
		System.out.println(str3 == str4);//false hem degerler hem referans farkli
		
		System.out.println(str3.equals(str4));//false degerler farkli
	
		System.out.println(str3.equalsIgnoreCase(str4)); // true icerik ayni, case sensitive degil
													// sadece harflerin farklarini ignor yapar
	
	}

}
