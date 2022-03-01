package com.training.employee_task;

public class HourlyEmployee extends EmployeePayroll {

	double hourlyRate;
	int hours;
	PersonalDetails details;

	public HourlyEmployee(double hourlyRate, int hours, PersonalDetails details) {
		this.hourlyRate = hourlyRate;
		this.hours = hours;
		this.details = details;
	}

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

	@Override
	public String getName() {
		return details.name;
	}

	@Override
	public void printDetails() {
		details.printPersonalDetails();
	}

}
