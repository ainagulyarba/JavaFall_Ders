package day05_matematikselIslemler_Modulus;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
	// kullanicidan 3 basamakli bi sayi alip
		//rakamlar toplamini yazdiran
		// bir program yaziniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();

		//sayi573 olsun
		
int rakamlarToplami=0;

int rakam=sayi%10; //bana birler basamagini verir

rakamlarToplami+=rakam;// rakamlar toplami 3 oldu

//sayimiz hala 573

//3ten kurtulmak istiyorum
//cunku 3 ile isim bitti
// sayiyi57 haline getirin

sayi/=10;


//sayim artik 57
// 7yi nasil alirim?
rakam=sayi%10;
 
rakamlarToplami+=rakam;
System.out.println(rakamlarToplami);

//sayi hala 57
// 7 den kurtulalim
sayi/=10;
//sayi artik 5

rakamlarToplami+=sayi;

System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);


	}

}
