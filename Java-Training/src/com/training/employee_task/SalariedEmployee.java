package com.training.employee_task;

public class SalariedEmployee implements EmployeePayroll {

	double weeklySalary;

	public SalariedEmployee(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double calculatePayroll() {
		return weeklySalary;

	}

}
