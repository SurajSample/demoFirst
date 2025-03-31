package collection;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class arralist_creation {

	public static void main(String[] args) {
		
		//List <String> li=new ArrayList<String>();
//		AbstractList<Integer> obj1=new ArrayList<Integer>();
		
		
		List<Integer> li =new LinkedList<Integer>();
		List<Integer> li1 =new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		System.out.println(li.size());
		
		li1.add(30);
		li1.addFirst(null);
		
		boolean res=li.addAll(li1);
		System.out.println(res);
//		li.add("suraj");
//		li.add("suraj");
//		li.add("suraj");
		
//		System.out.println(li);
		
		
		//print list using normal for loop
//		for(int i=0;i<li.size();i++)
//		{
//			System.out.println("Element at index at "+i+"="+li.get(i));
//		}
		
		//print using enhanced for loop
		
//		for(String ele:li)
//		{
//			System.out.println(ele);
//		}

		//print using iterator
		
				Iterator<Integer> it=li.iterator();
				
				while(it.hasNext())
				{
					Integer item=it.next();
					System.out.println(item);
				}
		
				
				
				//hashset
				
		Set<String> set1=new HashSet<String>();
		set1.add("Bodh");
		set1.add("Suraj");
		
		
		Set<String> set2=new HashSet<String>();
		
		set2.add("Bodhale");
		
		set1.addAll(set2);
		
		Iterator<String> itr=set1.iterator();
		while(itr.hasNext())
		{
			String res2=itr.next();
			System.out.println(res2);
		}
		
		
		
		
		
		
		
				
				
		
	}

}
