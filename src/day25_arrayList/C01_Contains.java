package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		
		//verilen bir array de tekrar eden elementleri sadece birer tane yazarak
		//unique elementlerden olusan bir array haline getirelim
		
		int arr []= {2,3,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5};
		
		// 2,3,4,5,6,7,8,9,1,0
		
		List<Integer> tekrarsiz = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!tekrarsiz.contains(arr[i])) {//icinde var mi
				
				tekrarsiz.add(arr[i]);//eklemek
				
			}
		}
		
		System.out.println("Tekrarsiz list: " + tekrarsiz);//[2, 3, 4, 5, 6, 7, 8, 9, 1, 0]// listten index cikarabiliriz
		
		
		int tekrarsizArray[]=new int[tekrarsiz.size()];
		
		//System.out.println(Arrays.toString(tekrarsizArray));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

		for (int i = 0; i < tekrarsizArray.length; i++) {
			
			tekrarsizArray[i]=tekrarsiz.get(i);
		
		}
		
		System.out.println(Arrays.toString(tekrarsizArray));//array den index cikaramiyoruz
		
		
		
		
		
		
		
	}

}
