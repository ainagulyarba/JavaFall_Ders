package day20_scope;

import java.time.Instant;

public class InstanceVariable {

	int notMat=50;
	int notFen;
	//instance variable'larin scope'unda main method yoktur
	
	public static void main(String[] args) {
		//System.out.println(notMat); //main method static oldugu icin static olmayan variable'lar
									  //main method'da direk kullanilamaz veya goruntulemez
		//instance variable'lara main method'dan ulasmak istersek obje olusturup
	    //obje uzerinden erisim saglayabiliriz
		
	    //Scanner scan = new Scanner(System.in)
	    //icinde oldugumuz class'tan  bir obje olusturalim
		InstanceVariable celil=new InstanceVariable();
		System.out.println(celil.notMat);//50
		
		InstanceVariable nihal=new InstanceVariable();
		nihal.notMat=70;
		
		System.out.println(nihal.notMat);
		//instance variable'larda deger atamazsak java instance olarak atanan degeri alir
		//bu class icin notMat=50 gibi
		//ama istersek deger de atayabiliriz,
		//bu durumda deger atadigimiz obje yeni deger gecerli olur
		
		System.out.println(celil.notMat); //50
		
		//celil'in notunu degistirmek istiyorsak celil.notMat'a deger atamaliyiz
		celil.notMat=90;
		
		System.out.println(celil.notMat);//90
	
	    celil.Method2();//method2 static olmadigi icin main method'tan direk cagrilamaz
	
	}
		public static void staticMethod() {
		//System.out.println(notFen);//instance variable'lara static method'lardan direk ulasilamaz
	
}

    public void Method2() {
	System.out.println("method2deki notfen : " + notFen);//bu method static olmadigi icin 
					//instance variable'lara direk ulasilabilir
					//instance variable olusturulurken deger atanmasa da olur
					//bu durumda java default degerler atar
					//int icin default deger 0'dir
	
	notFen=100;
	System.out.println("method2deki duzeltilmis notFen : " + notFen);
}




}
