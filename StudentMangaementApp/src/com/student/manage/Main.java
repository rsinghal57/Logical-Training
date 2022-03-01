package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Student Management App");
		while (true) {
			System.out.println("Press 1 to add a student");
			System.out.println("Press 2 to delete a student");
			System.out.println("Press 3 to display a student");
			System.out.println("Press 4 to quit.");
			int ch = Integer.parseInt(br.readLine());
			if (ch == 1) {
				System.out.println("Enter Student name");
				String name = br.readLine();
				System.out.println("Enter Student phone number");
				String phone = br.readLine();
				System.out.println("Enter Student city");
				String city = br.readLine();
				Student s = new Student(name, phone, city);
				boolean result = StudentDao.insertStudentToDB(s);
				if (result) {
					System.out.println("Student added successfully");
				} else {
					System.out.println("Something went wrong.");
				}
			} else if (ch == 2) {
				System.out.println("Enter student ID to delete");
				int studentId = Integer.parseInt(br.readLine());
				boolean result = StudentDao.deleteStudent(studentId);
				if (result) {
					System.out.println("Student deleted successfully");
				} else {
					System.out.println("Something went wrong.");
				}
			} else if (ch == 3) {
				StudentDao.showAllStudents();
			} else if (ch == 4) {
				break;
			} else {
				System.out.println("Invalid choice");
			}
		}
	}

}
