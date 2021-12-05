package day17_forLoop;

import java.util.Scanner;

public class C02_soru7 {

	public static void main(String[] args) {
		//Soru 7 ) Interview Question Kullanicidan bir String isteyin 
		//ve Stringi tersten yazdirin.

Scanner scan = new Scanner(System.in);
System.out.println("Lutfen tersten yazdirmak icin bir yazi girin:");
String str = scan.nextLine();

//cekoslavakyalilastiramadiklarimizdanmisiniz

for (int i = str.length()-1; i>=0 ; i--) {
	System.out.print(str.substring(i,i+1));
}


	
	}

}
