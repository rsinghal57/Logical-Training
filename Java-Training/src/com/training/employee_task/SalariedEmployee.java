package com.training.employee_task;

public class SalariedEmployee implements EmployeePayroll {

	double weeklySalary;
	PersonalDetails details;

	public SalariedEmployee(double weeklySalary, PersonalDetails details) {
		this.weeklySalary = weeklySalary;
		this.details = details;
	}

	@Override
	public double calculatePayroll() {
		return weeklySalary;

	}

	@Override
	public String getName() {
		return details.name;
	}

	@Override
	public void printDetails() {
		details.printPersonalDetails();
	}

}
