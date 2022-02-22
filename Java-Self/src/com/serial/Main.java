package com.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student("Rohit",3535);
		s1.setX(500);
		String fileName="C:\\Users\\rohit.singhal\\test.txt";
		FileOutputStream fileOut=null;
		ObjectOutputStream objOut=null;
		//Serialization
		try
		{
			fileOut= new FileOutputStream(fileName);
			objOut= new ObjectOutputStream(fileOut);
			objOut.writeObject(s1);
			
			fileOut.close();
			objOut.close();
			
			System.out.println("The object has been serializaed: ");
			s1.display();
		}
		catch(IOException ex)
		{
			System.out.println("IO exception is caught: "+ex);
		}
		System.out.println(s1.getX());
		// De-Serialization
		FileInputStream fileIn=null;
		ObjectInputStream objIn=null;
				try
				{
					fileIn= new FileInputStream(fileName);
					objIn= new ObjectInputStream(fileIn);
					Student object= (Student) objIn.readObject();
					fileOut.close();
					objOut.close();
					
					System.out.println("The object has been de-serializaed: "+object);
					object.display();
					System.out.println(object.getX());

				}
				catch(IOException ex)
				{
					System.out.println("IO exception is caught: "+ex);
				}
				catch(ClassNotFoundException ex)
				{
					System.out.println("Class not found exception is caught: "+ex);

				}

		
		
		// TODO Auto-generated method stub

	}

}
