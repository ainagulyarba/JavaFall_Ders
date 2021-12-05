package day26_forEachLoop_constructor;

public class Car {

	//Java biz bir class olusturdugumuzda, o class'tan obje uretecegimizi bilir
	// ve her class'a default bir constructor yerlestirir
	//Java'nin cllas'a koydugu bu default constructor gorunmez
	//ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	//bir constructor olusturmak cok kolaydir
	//method'a benzer ama farklidir
	//1- Constructor ismi class ismi ile ayni olmalidir
	//class isimleri buyuk harfle basladigi icin constructor ismi de buyuk harfle baslar
	//(method'tan 1.farki budur, method'lar kucuk harfle baslar
	//2- Constructorlarrin return type'i olmaz
	//(method'tan 2.farki budur, method'larin mutlaka return type'i olmalidir
	
	public Car () {
		
	}
	
	// ya da public Car1 () {}
	
	
	public int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	
	//bugun itibariyle class'larda main method olma mecburiyeti kaldirilmistir:)
	//ancak bildigimiz gibi main method olmayan bir class direk calistirilamaz
	//main method'u olmayan class'lar baska class'lardan obje olsturarak kullanilmak uzere
	//ihtiyac duyulan variable ve method'lari sakladigimiz bir depo gibidir
	
	
	
	
	
	
	
	
	
	
	
}
