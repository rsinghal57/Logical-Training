package com.training.employee_task;

import java.util.Scanner;

import com.training.employee_task.databaseregistration.EmployeeDao;
import com.training.employee_task.fileregistration.EmployeeFileRegistration;

public class PersistentChoice {

	public Persistence helper() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your persistence choice:-");
		System.out.println("1)File System  2)Database");
		int persistenceChoice = sc.nextInt();
		Persistence p;
		if (persistenceChoice == 1) {
			p = new EmployeeFileRegistration();
		} else {
			p = new EmployeeDao();
		}
		return p;
	}

}
