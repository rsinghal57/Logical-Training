package com.training.employee_task;

public class CommissionEmployee extends EmployeePayroll {

	double salesAmount;
	PersonalDetails details;

	public CommissionEmployee(double salesAmount, PersonalDetails details) {
		this.salesAmount = salesAmount;
		this.details = details;
	}

	public CommissionEmployee(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	@Override
	public double calculatePayroll() {
		return 0.15 * salesAmount;
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
