package day28__ConstructorCall_StaticKeyword;

public class C01 {
		
		 int x = 3;
		 int y = 5;
		   
		 C01() {
		        x += 1;
		        System.out.println("-x" + x);
		    }
		 
		 C01(int i) {
		        this();
		        this.y = i;
		        x += y;
		        System.out.println("-x" + x);
		    }
		  
		 C01(int i, int i2) {
		        this(3);
		        this.x -= 4;
		        System.out.println("-x" + x);
		    }
		   
		
		 public static void main(String[]args) {
		        
		         C01 c01= new C01(4,3);
		        
		         //constructor calismaya basladiktan sonra x ve y ile degismeler 
		         //(x ve y instance variable oldugundan) sadece c01 objesini ilgilendirir
		         //constructor'un isi bittiginde instance degerler ilk halini alir
		         System.out.println("c01 icin x : " + c01.x +", c01 icin y : "+ c01.y);
		
		         C01 c02= new C01();
		         System.out.println("c02 icin x : " + c02.x +", c02 icin y : "+ c02.y);
		         
		         
		         
}
}