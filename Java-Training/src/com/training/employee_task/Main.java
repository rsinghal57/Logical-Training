package com.training.employee_task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of Employee: ");
		System.out.println("1:Salaried Employee  2:Houlry Employee");
		System.out.println("3:Commission Employee  4:Base Salaried Commission Employee");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("Enter weekly salary");
			double salary = sc.nextDouble();
			SalariedEmployee se = new SalariedEmployee(salary);
			System.out.println("The weekly salary is: " + se.calculatePayroll());
			break;
		case 2:
			System.out.println("Enter houlry salary");
			double hourlySalary = sc.nextDouble();
			System.out.println("Enter number of hours worked");
			int hours = sc.nextInt();
			HourlyEmployee he = new HourlyEmployee(hourlySalary, hours);
			System.out.println("The weekly salary is: " + he.calculatePayroll());
			break;
		case 3:
			System.out.println("Enter weekly sales amount");
			double weeklySales = sc.nextDouble();
			CommissionEmployee ce = new CommissionEmployee(weeklySales);
			System.out.println("The weekly salary is: " + ce.calculatePayroll());
			break;
		case 4:
			System.out.println("Enter weekly sales amount");
			double weeklySalesAmount = sc.nextDouble();
			System.out.println("Enter weekly base salary");
			double weeklyBaseSalary = sc.nextDouble();
			System.out.println("Enter bonus percentage");
			double bonusPercentage = sc.nextDouble();
			BaseSalariedCommissionEmployee bsce = new BaseSalariedCommissionEmployee(weeklyBaseSalary,
					weeklySalesAmount, bonusPercentage);
			System.out.println("The weekly salary is: " + bsce.calculatePayroll());
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}

}
