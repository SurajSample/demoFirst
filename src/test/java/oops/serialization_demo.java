package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.tools.FileObject;

public class serialization_demo implements Serializable
{
	int id;
	String name;
	
	public serialization_demo(int id, String name) 
	{
		this.id=id;	this.name=name;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		serialization_demo s1=new serialization_demo(27,"Suraj");
		
		FileOutputStream foo=new FileOutputStream(System.getProperty("user.dir")+"\\myfile.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(foo);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		System.out.println("object converted Successfuly into file format");
		
		//de-serialization
		
//		FileInputStream f1=new FileInputStream(System.getProperty("user.dir")+"\\myfile.ser");
//		ObjectInputStream oo=new ObjectInputStream(f1);
//		serialization_demo sde=(serialization_demo) oo.readObject();
//		System.out.println(sde.id+"-"+sde.name);
//		oo.close();
		
		
		
		
		
				
		
		
		
		

	}

}
