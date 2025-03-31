package oops;

class test extends abstract_demo
{
	@Override
	void m1(int a) 
	{
		System.out.println("M1 implemented in subclass");
	}
	public static void main(String[] args) 
	{
		test obj=new test();
		obj.m1(1);
		
	}
}

public abstract class abstract_demo 
{
	public abstract_demo()
	{
		System.out.println("complete method 1");
	}
	
	abstract void m1(int a);
	
}