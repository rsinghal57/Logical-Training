package com.training.employee_task;

import java.io.Serializable;

public abstract class EmployeePayroll implements Serializable {

	public abstract double calculatePayroll();

	public abstract String getName();

	public abstract void printDetails();

}
