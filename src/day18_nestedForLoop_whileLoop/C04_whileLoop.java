package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_whileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devam edip
		// kullanici sifira bastiginda
		// o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin

		// kullanicidan 5sayi alin dese
		
	for (int i = 0; i < args.length; i++) {
		//kullanicidan bir deger alip toplama eklerdim
		
	}	
	
	Scanner scan = new Scanner(System.in);
	//loop'un icinde kullanacagim obje ve variable' lari looptan once olusturmak guzeldir
	//cunku loop'un icinde olusturursak
	//loop her dondugunde yeni bir obje veya
	//variable olusturur ve bu da hafizayi doldurur
	
	int sayi = 100;//0 veremeyiz cunku 0 ile islem biticek
	int toplam=0;
	int sayac =0;
	
	while (sayi!=0) {
		System.out.println("lutfen toplama eklemek icin bir tam sayi yazin\n bitirmek icin 0'a basin");
		sayi = scan.nextInt();
		toplam+=sayi;
		sayac++;

	}
	//kullanici 0'a bastiginda loop islemini sonkez yapip 
	//sonra basa donecek ve loop bitecek
	//0 toplamak uzere verilmeyip,
	//sadece bitirmek icin verildiginden
	//sifiri sayac'a eklemek icin 43.satirda  
		System.out.println("girilen sayi adedi : " + (sayac-1));
		System.out.println("girilen sayilarin toplami: "+toplam);
		}
		
	}


