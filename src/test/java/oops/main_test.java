package oops;

public class main_test implements interface_demo 
{

	public void m1()
	{
		System.out.println("Implemented M1");
	}
	public static void main(String[] args) 
	{
		main_test obj=new main_test();
		obj.m1();

	}

}
