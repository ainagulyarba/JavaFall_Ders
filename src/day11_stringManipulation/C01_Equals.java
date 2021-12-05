package day11_stringManipulation;

public class C01_Equals {

	public static void main(String[] args) {
		
		int a=10;
		int b=a+0;
		System.out.println(a==b); // true
		
		char ch1='K';
		char ch2='K' + 0;
		System.out.println(ch1==ch2); //true
		
		String str1= "Ali";
		String str2="Can";
		String str3= "Ali Can";
		String str4=str1+" "+str2; 
		
		System.out.println(str4);// Ali Can
		System.out.println(str3 == str4);//false
		
		System.out.println(str3.equals(str4));//true
		
		
		// String veriablenlarda == hem degere hem referansa bakar
		// dolayisiyla objeler farkli oldugunda genelde false doner
		//str1.equals(str2) ise referanslara degil SADECE DEGERE BAKAR
		//eger case sensetive olarak String degerleri ayni ise true doner
		
		//== hem degere hem referansa bakar
		//equals sadece degere bakar
		
		
		
		
	}

}
