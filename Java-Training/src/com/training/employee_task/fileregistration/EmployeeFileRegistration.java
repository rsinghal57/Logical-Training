package com.training.employee_task.fileregistration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.training.employee_task.EmployeePayroll;
import com.training.employee_task.Persistence;
import com.training.employee_task.PersonalDetails;

public class EmployeeFileRegistration implements Persistence {
	static HashMap<String, EmployeePayroll> map = new HashMap<>();
	private static Logger logger = LogManager.getLogger(EmployeeFileRegistration.class);
	static String fileName = "C:\\Users\\rohit.singhal\\eclipse-workspace\\Java-Training\\resources\\HashMapData.txt";

	public boolean insertEmployee(PersonalDetails pd, EmployeePayroll ep) throws IOException {

		File file = new File(fileName);
		file.createNewFile();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		if (br.readLine() != null) {
			// De-Serialization

			FileInputStream fileIn = null;
			ObjectInputStream objIn = null;
			try {
				fileIn = new FileInputStream(fileName);
				objIn = new ObjectInputStream(fileIn);
				map = (HashMap) objIn.readObject();
				fileIn.close();
				objIn.close();

			} catch (IOException ex) {
				System.out.println("IO exception is caught: " + ex);
				return false;
			} catch (ClassNotFoundException ex) {
				System.out.println("Class not found exception is caught: " + ex);
				return false;
			}
		}
		if (map.containsKey(ep.getName())) {
			logger.debug("Name already exists, so it will be over-rided");
		}
		map.put(ep.getName(), ep);

		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		// Serialization
		try {
			fileOut = new FileOutputStream(fileName);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(map);

			fileOut.close();
			objOut.close();

			System.out.println("The object has been serializaed: ");
		} catch (IOException ex) {
			System.out.println("IO exception is caught: " + ex);
			return false;
		}
		return true;

	}

	public void searchEmployee(String name) {
		// De-Serialization
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		try {
			fileIn = new FileInputStream(fileName);
			objIn = new ObjectInputStream(fileIn);
			map = (HashMap) objIn.readObject();
			fileIn.close();
			objIn.close();

		} catch (IOException ex) {
			System.out.println("IO exception is caught: " + ex);
		} catch (ClassNotFoundException ex) {
			System.out.println("Class not found exception is caught: " + ex);

		}
		if (!map.containsKey(name)) {
			System.out.println("Employee not found!");
			logger.error("Object not found in map");
			return;
		}
		EmployeePayroll ep = map.get(name);
		logger.info("Emoloyee found! (query in map successful)");
		ep.printDetails();
	}

}
