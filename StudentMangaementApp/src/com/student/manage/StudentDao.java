package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(Student s) {
		boolean flag = false;
		try {
			// JDBC Code...
			Connection conn = ConnectionProvider.createConnection();
			String q = "insert into students(sname,sphone,scity) values (?,?,?)";
			// Prepared Statement for parameterized (dynamic) query
			PreparedStatement pstmt = conn.prepareStatement(q);
			pstmt.setString(1, s.getStudentName());
			pstmt.setString(2, s.getStudentPhone());
			pstmt.setString(3, s.getStudentCity());

			// execute query
			pstmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteStudent(int studentId) {
		boolean flag = false;
		try {
			// JDBC Code...
			Connection conn = ConnectionProvider.createConnection();
			String q = "delete from students where sid=?";
			// Prepared Statement for parameterized (dynamic) query
			PreparedStatement pstmt = conn.prepareStatement(q);
			pstmt.setInt(1, studentId);
			// execute query
			pstmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;

	}

	public static void showAllStudents() {
		try {
			// JDBC Code...
			Connection conn = ConnectionProvider.createConnection();
			String q = "select * from students";
			// Statement
			Statement stmt = conn.createStatement();
			// execute query
			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				int sid = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				System.out.print("Id: " + sid + " ");
				System.out.print("Name: " + name + " ");
				System.out.print("Phone: " + phone + " ");
				System.out.print("City: " + city + " ");
				System.out.println();
				System.out.println("++++++++++++++");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
