package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.models.Employee;
import com.greatlearning.services.CredentialServices;


public class Driver {
	
	public static void main(String[] args) {
		
		int option;
		String firstName;
		String lastName;
		String company;
		
		CredentialServices credservices = new CredentialServices();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		firstName = sc.next();
		System.out.println("Please enter your last name");
		lastName = sc.next();
		System.out.println("Please enter the name of your company");
		company = sc.next();
		Employee employee = new Employee(firstName,lastName,company);
		System.out.println("Please enter your departrment");
		System.out.println("1. Admin");
		System.out.println("2. Legal");
		System.out.println("3. HR");
		System.out.println("4. Tech");
		option = sc.nextInt();
		
		switch(option) {
		case 1: employee.setDepartment("admin");
		break;
		
		case 2: employee.setDepartment("legal");
		break;
		
		case 3: employee.setDepartment("hr");
		break;
		
		case 4: employee.setDepartment("tech");
		break;
		};
		
		
		credservices.showCredentials(employee);
		sc.close();
	}

}
