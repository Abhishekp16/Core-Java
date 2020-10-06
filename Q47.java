class Abc
{
	Abc()
	{
		System.out.println("No-arg Constructor Abc");
	}
	Abc(int i)
	{
		System.out.println("Parameterized Constructor Abc");
	}
}
class Pqr extends Abc
{
	Pqr()
	{
		
		System.out.println("No-arg Constructor Pqr");
	}
	Pqr(int i)
	{
		System.out.println("Parameterized Constructor Pqr");
	}
}
class MainC
{
	public static void main(String args[])
	{
		Pqr p = new Pqr();
		Pqr P1 = new Pqr(11);
	}
}