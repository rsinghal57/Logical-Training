package com.training.employee_task;

public class HourlyEmployee implements EmployeePayroll {

	double hourlyRate;
	int hours;

	public HourlyEmployee(double hourlyRate, int hours) {
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	@Override
	public double calculatePayroll() {
		double weeklySalary;

		if (hours <= 40) {
			weeklySalary = hours * hourlyRate;
		} else {
			weeklySalary = 40 * hourlyRate;
			hours -= 40;
			weeklySalary += 1.5 * hourlyRate * hours;
		}
		return weeklySalary;

	}

}
