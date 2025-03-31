package oops;

public class synchronization_demo 
{
	private int balance=1000;
	
	 synchronized void withdraw(int amount)
	{
		if(balance>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" "+"withdrawing="+amount);
			balance=balance-amount;
			System.out.println("Remaining balance="+balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" get "+"Insufficient Balance");
		}
		 
	}

	public static void main(String[] args) 
	{
		synchronization_demo obj=new synchronization_demo();
		Thread t1=new Thread(()->obj.withdraw(500),"User1");
		Thread t2=new Thread(()->obj.withdraw(700),"User2");
		
		t1.start();
		t2.start();
		
	}

}
