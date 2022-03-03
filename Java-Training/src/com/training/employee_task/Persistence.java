package com.training.employee_task;

import java.io.IOException;

public interface Persistence {

	public boolean insertEmployee(PersonalDetails pd, EmployeePayroll ep) throws IOException;

	public void searchEmployee(String name);
}
