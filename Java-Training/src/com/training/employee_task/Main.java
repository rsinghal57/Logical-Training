package com.training.employee_task;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, EmployeePayroll> map = new HashMap<>();

	public static void registration() {
		while (true) {
			System.out.println("press 0 to quit or any other number to continue");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println("Enter name of employee");
			String name = sc.next();
			System.out.println("Enter employee ID");
			int empId = sc.nextInt();
			System.out.println("Enter email address");
			String email = sc.next();
			System.out.println("Enter Country of residence");
			String country = sc.next();
			System.out.println("Enter state of residence");
			String state = sc.next();
			System.out.println("Enter city");
			String city = sc.next();
			System.out.println("Enter local address");
			String localAddress = sc.next();
			System.out.println("Enter PIN code");
			int pin = sc.nextInt();
			Address a1 = new Address(country, state, city, localAddress, pin);
			PersonalDetails pd = new PersonalDetails(name, empId, email, a1);

			System.out.println("Enter the type of Employee: ");
			System.out.println("1:Salaried Employee  2:Houlry Employee");
			System.out.println("3:Commission Employee  4:Base Salaried Commission Employee");
			EmployeePayroll ep = null;
			int key = sc.nextInt();
			if (key == 1) {
				System.out.println("Enter weekly salary");
				double salary = sc.nextDouble();
				ep = new SalariedEmployee(salary, pd);
			} else if (key == 2) {
				System.out.println("Enter houlry salary");
				double hourlySalary = sc.nextDouble();
				System.out.println("Enter number of hours worked");
				int hours = sc.nextInt();
				ep = new HourlyEmployee(hourlySalary, hours, pd);
			} else if (key == 3) {
				System.out.println("Enter weekly sales amount");
				double weeklySales = sc.nextDouble();
				ep = new CommissionEmployee(weeklySales, pd);

			} else if (key == 4) {
				System.out.println("Enter weekly sales amount");
				double weeklySalesAmount = sc.nextDouble();
				System.out.println("Enter weekly base salary");
				double weeklyBaseSalary = sc.nextDouble();
				System.out.println("Enter bonus percentage");
				double bonusPercentage = sc.nextDouble();
				ep = new BaseSalariedCommissionEmployee(weeklyBaseSalary, weeklySalesAmount, bonusPercentage, pd);
			} else {
				System.out.println("Invalid employee type");
			}
			map.put(ep.getName(), ep);

		}
	}

	public static void searchEmployee(String name) {
		if (!map.containsKey(name)) {
			System.out.println("Employee not found!");
			return;
		}
		EmployeePayroll ep = map.get(name);
		ep.printDetails();
	}

	public static void main(String[] args) {
		registration();
		System.out.println("Enter Employee name to fetch details");
		String name = sc.next();
		searchEmployee(name);
		sc.close();
	}

}
