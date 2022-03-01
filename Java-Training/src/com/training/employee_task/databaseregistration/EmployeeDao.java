package com.training.employee_task.databaseregistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.training.employee_task.EmployeePayroll;
import com.training.employee_task.PersonalDetails;

public class EmployeeDao {

	public static boolean insertEmployeeToDB(PersonalDetails pd, EmployeePayroll ep) {
		boolean flag = false;
		try {
			// JDBC Code...
			Connection conn = ConnectionProvider.createConnection();
			String q = "insert into employeetask(ename,eid,email,country,state,city,address,pin,payroll) values (?,?,?,?,?,?,?,?,?)";
			// Prepared Statement for parameterized (dynamic) query
			PreparedStatement pstmt = conn.prepareStatement(q);
			pstmt.setString(1, pd.name);
			pstmt.setInt(2, pd.empId);
			pstmt.setString(3, pd.email);
			pstmt.setString(4, pd.address.country);
			pstmt.setString(5, pd.address.state);
			pstmt.setString(6, pd.address.city);
			pstmt.setString(7, pd.address.localAddress);
			pstmt.setInt(8, pd.address.pincode);
			String payroll = String.valueOf(ep.calculatePayroll());
			pstmt.setString(9, payroll);

			// execute query
			pstmt.executeUpdate();
			flag = true;
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void searchEmployee(String name) {
		try {
			// JDBC Code...
			Connection conn = ConnectionProvider.createConnection();
			String q = String.format("select * from employeetask where ename=\"%s\"", name);
			// Statement
			Statement stmt = conn.createStatement();
			// execute query
			ResultSet set = stmt.executeQuery(q);
			if (set.next() == false) {
				System.out.println("No entry found in Database");
			} else {
				do {
					String ename = set.getString(1);
					int eid = set.getInt(2);
					String email = set.getString(3);
					String country = set.getString("country");
					String state = set.getString("state");
					String city = set.getString("city");
					String address = set.getString("address");
					int pin = set.getInt("pin");
					String payroll = set.getString("payroll");
					System.out.println("EmployeeId: " + eid);
					System.out.println("Name: " + ename);
					System.out.print("Email: " + email);
					System.out.println("Country: " + country);
					System.out.println("State: " + state);
					System.out.println("City: " + city);
					System.out.println("Address: " + address);
					System.out.println("PIN Code: " + pin);
					System.out.println("Weekly Salary: " + payroll);
					System.out.println();
					System.out.println("++++++++++++++");
				} while (set.next());
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
