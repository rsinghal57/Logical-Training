package com.training.employee_task;

public class BaseSalariedCommissionEmployee extends EmployeePayroll {

	double weeklyBaseSalary;
	double salesAmount;
	double bonusPercentage;
	PersonalDetails details;

	public BaseSalariedCommissionEmployee(double weeklyBaseSalary, double salesAmount, double bonusPercentage,
			PersonalDetails details) {
		this.weeklyBaseSalary = weeklyBaseSalary;
		this.salesAmount = salesAmount;
		this.bonusPercentage = bonusPercentage;
		this.details = details;
	}

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

	@Override
	public String getName() {
		return details.name;
	}

	@Override
	public void printDetails() {
		details.printPersonalDetails();
	}

}
