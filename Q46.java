class A{
	A()
	{
		System.out.println("A");
	}
}

class B extends A{
	B()
	{
		System.out.println("B");
	}
}


public class Instanceof {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		A a2 = new B();
		B b2 = (B)a2;
		
	boolean l =	a1 instanceof A;
	boolean m = b1 instanceof B;
	
	boolean n=	a2 instanceof A;
	boolean o = b2 instanceof B;
	
	boolean p =	b2 instanceof A;
	boolean q = b2 instanceof B;
	

	boolean r =	b1 instanceof A;
	boolean s = a1 instanceof B;
	
	System.out.println("l = "+l  );
	System.out.println("m = "+m  );
	System.out.println("n = "+n  );
	System.out.println("o = "+o  );
	System.out.println("p = "+p  );
	System.out.println("q = "+q  );
	System.out.println("r = "+r  );
	System.out.println("s = "+s  );	
		
	
	}

}