package com.training.employee_task;

public class CommissionEmployee implements EmployeePayroll {

	double salesAmount;

	public CommissionEmployee(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	@Override
	public double calculatePayroll() {
		return 0.15 * salesAmount;
	}

}
