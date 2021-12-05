package day23_multiDimensionalArrays;

public class C03_MDArray {

	private static Object arr;
		
		//Soru 1 ) Asagidaki multi dimensional array’in tum elemanlarinin
		//carpimini ekrana  yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
	
	public static void main(String[] args) {
		
		int arr[][]={ {1,2},{4,5,6,7}};
		
		elemanCarpimi(arr);
		

	}

	public static void elemanCarpimi(int arr[][]) {
			
		int carpim =1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int  j= 0; j < arr[i].length; j++) {
				carpim*=arr[i][j];
				
			}
		}
		
		System.out.println(carpim);
		
		
	}

}
