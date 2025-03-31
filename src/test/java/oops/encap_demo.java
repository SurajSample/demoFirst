package oops;

public class encap_demo 
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) {
	
		encap_demo obj=new encap_demo();
		obj.setName("Suraj");
		
		obj.setName("GHJ");
		System.out.println(obj.getName());
	}
}
