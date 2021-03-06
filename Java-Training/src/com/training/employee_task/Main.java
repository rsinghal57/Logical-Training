package com.training.employee_task;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static Logger logger = LogManager.getLogger(Main.class);

	public static void registration(Persistence p) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("press 0 to quit or any other number to continue");
			try {
				int choice = sc.nextInt();
				if (choice == 0)
					break;
			} catch (InputMismatchException e) {
				String badInput = sc.next();
				System.out.println(e);
				continue;
			}
			sc.nextLine();
			System.out.println("Enter name of employee");
			String name = sc.nextLine();
			int empId;
			while (true) {
				System.out.println("Enter employee ID");
				try {
					empId = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					String badInput = sc.next();
					System.out.println(e);
					continue;
				}
			}
			System.out.println("Enter email address");
			String email = sc.next();
			System.out.println("Enter Country of residence");
			String country = sc.next();
			System.out.println("Enter state of residence");
			String state = sc.next();
			System.out.println("Enter city");
			String city = sc.next();
			sc.nextLine();
			System.out.println("Enter local address");
			String localAddress = sc.nextLine();
			int pin;
			while (true) {
				System.out.println("Enter PIN Code");
				try {
					pin = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					String badInput = sc.next();
					System.out.println(e);
					continue;
				}
			}
			Address a1 = new Address(country, state, city, localAddress, pin);
			logger.info("A Address class object is created");
			PersonalDetails pd = new PersonalDetails(name, empId, email, a1);
			logger.info("Personal Detail object is created");

			System.out.println("Enter the type of Employee: ");
			System.out.println("1:Salaried Employee  2:Houlry Employee");
			System.out.println("3:Commission Employee  4:Base Salaried Commission Employee");
			EmployeePayroll ep = null;
			String key = sc.next();
			if (key.equals("1")) {
				System.out.println("Enter weekly salary");
				double salary = sc.nextDouble();
				ep = new SalariedEmployee(salary, pd);
				logger.info("A salaried employee is created(Constructor is called)");
			} else if (key.equals("2")) {
				System.out.println("Enter houlry salary");
				double hourlySalary = sc.nextDouble();
				System.out.println("Enter number of hours worked");
				int hours = sc.nextInt();
				ep = new HourlyEmployee(hourlySalary, hours, pd);
				logger.info("A Hourly salaried employee is created(Constructor is called)");

			} else if (key.equals("3")) {
				System.out.println("Enter weekly sales amount");
				double weeklySales = sc.nextDouble();
				ep = new CommissionEmployee(weeklySales, pd);
				logger.info("A Commission employee is created(Constructor is called)");

			} else if (key.equals("4")) {
				System.out.println("Enter weekly sales amount");
				double weeklySalesAmount = sc.nextDouble();
				System.out.println("Enter weekly base salary");
				double weeklyBaseSalary = sc.nextDouble();
				System.out.println("Enter bonus percentage");
				double bonusPercentage = sc.nextDouble();
				ep = new BaseSalariedCommissionEmployee(weeklyBaseSalary, weeklySalesAmount, bonusPercentage, pd);
				logger.info("A Base Salaried Commission employee is created(Constructor is called)");

			} else {
				System.out.println("Invalid employee type");
			}

			boolean result = p.insertEmployee(pd, ep);
			if (result) {
				logger.info("Employee added to Database successfully");
			} else {
				logger.error("Something went wrong! Try again");
			}

		}
		searchEmployee(p);

	}

	public static void searchEmployee(Persistence p) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name to fetch details");
		String name = sc.next();
		p.searchEmployee(name);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		logger.info("Logger in employee working");
		System.out.println("Choose: 1)Register Emoloyee   2)Search an Employee");
		String choice = sc.next();
		Persistence p = new PersistentChoice().helper();
		if (choice.equals("1")) {
			registration(p);
		} else if (choice.equals("2")) {
			searchEmployee(p);
		} else {
			System.out.println("Invalid Input");
		}

	}
}
