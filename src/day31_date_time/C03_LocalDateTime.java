package day31_date_time;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat);//2021-12-02T21:40:02.887974200
		
		System.out.println(tarihSaat.toString().startsWith("2021"));//true
		
		
		
		
		
		

	}

}
