package oops;

class parent
{
	void m1()
	{
		System.out.println("M1 method");
	}
}

public class override_demo extends parent
{
	@Override
	void m1()
	{
		System.out.println("M1 implemented as per sub class");
	}

	public static void main(String[] args) 
	{
		override_demo obj=new override_demo();
		obj.m1();
	}

}
