package day33_stringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder("Java candir can");
		
	
		
		sb.deleteCharAt(11); //Java candircan
		System.out.println(sb);
		
		sb.delete(11, 13); //Java candirn => ilk index inclusive, ikinci index exclusive oldugundan 
		System.out.println(sb);
		
		sb.delete(11, sb.length());//Java candir
		System.out.println(sb);
		
		System.out.println(sb.capacity());//31    // element sayisi*element sayisi+2
		
		
		sb.delete(5, 20);// List gibi esnek onun icin yazdiriyor
		System.out.println(sb);//Java
		System.out.println(sb.capacity());//31
		
		
		
	}

}
