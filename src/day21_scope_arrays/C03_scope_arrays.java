package day21_scope_arrays;

public class C03_scope_arrays {

	public static void main(String[] args) {
		
		// Soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun bunu yapmiyor muyuz
		
		String arr[]=new String [3];
		arr[0]="Ali";
		arr[1]="Veli";
		arr[2]="Ayse";
		arr[3]="Fatma";
		
		String arr2 [] = {"Ali","Veli","Ayse","Fatma"};
		
		
		// Soru 2: Soru 1’deki elemanlardan “Ali” yerine “Can”, “Ayse” yerine “Gul” atayin
		
		arr2[0]="Can";
		arr2[2]="Gul";
		
		System.out.println(arr2[1]);//Veli
		
		System.out.println(arr[arr.length-1]);//String'deki length() idi, burada sadece length
		
		// System.out.println(arr[arr.length]); //ArrayIndexOutOfBoundsException--yazdigin index sinirlarin disinda diyor
		
		
		
		
	}

}
