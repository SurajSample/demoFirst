package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> obj = new HashMap<>();
		obj.put("Name", "Suraj");
		obj.put("Job", "QA");
		obj.put("Company", "T1");
		obj.put(null,"XYZ");//is it allowed
		obj.put(null,"ABC");//is it allowed
		System.out.println(obj);
		
		
		

	}

}
