package day10_nestedTernary_SwitchCase;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		// gun numarasina gore hafta ici veya hafta sonu yazdirin
		
		int gunNo = 3;
		
		switch (gunNo) {
		
		case 1:
		case 2: 
		case 3: 
		case 4: 	
		case 5: 
			System.out.println("hafta ici");
			break;
		case 6: 
		case 7: 
			System.out.println("hafta sonu");
			break;
			
		default:
		System.out.println("lutfen gecerli bir gun yaziniz");
		
		
		
		
		
		}

	}

}
