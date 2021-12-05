package day26_forEachLoop_constructor;

public class C01_forEachLoop {

	public static void main(String[] args) {
		//iki string array olusturunuz
		//ve bu array'lerdeki ortak elemanlari For-each loop kullanarak bulunuz
		//sonucu ekrana yazdiriniz
		//ortak eleman yoksa ekrana "Ortak eleman yok" yazdiriniz
		
		String arr1 [] = {"A","C","B"};
		String arr2 [] = {"N","R","O"};
		
		int flag=0;
		
		for (String each1 : arr1) {
			
			for (String each2 : arr2) {
				
				if (each1.equals(each2)) {
					
					System.out.print(each1+" ");
					flag++;
					
			}	
		}
				
	}
			
			if (flag==0) {
				
				System.out.println("Ortak eleman yok");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
