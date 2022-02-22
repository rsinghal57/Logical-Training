package com.training.employee_task;

public class BaseSalariedCommissionEmployee implements EmployeePayroll {

	double weeklyBaseSalary;
	double salesAmount;
	double bonusPercentage;

	public BaseSalariedCommissionEmployee(double weeklyBaseSalary, double salesAmount, double bonusPercentage) {
		this.weeklyBaseSalary = weeklyBaseSalary;
		this.salesAmount = salesAmount;
		this.bonusPercentage = bonusPercentage;
	}

	@Override
	public double calculatePayroll() {
		double weeklySalary = weeklyBaseSalary + 0.12 * salesAmount;
		weeklySalary += (bonusPercentage / 100) * weeklyBaseSalary;
		return weeklySalary;
	}

}
