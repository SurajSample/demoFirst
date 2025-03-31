package collection;

import java.util.LinkedList;

public class LinkedList_Demo 
{

	public static void main(String[] args) {
	
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("10");
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("suraj");
		ll.add("Mahesh");
		ll.add(1, "Test");//add elemnt to index
		
		//ll.addAll(ll2);//add one collection another collection
		
		ll.addAll(3, ll2);
		
		System.out.println(ll);
		
		
		
		
		
		

	}

}
