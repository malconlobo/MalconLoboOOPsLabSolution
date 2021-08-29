package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.models.Employee;

public class CredentialServices {

	public String generateEmail(Employee employee) {
		return employee.getFirstName() + employee.getLastName() + "." + employee.getDepartment() + "@" + employee.getCompany() + ".com";

	}

	public char[] generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String special = "!@#$%^&*()";
		char[] password = new char[8];
		Random random = new Random();

		for (int i = 0; i < 2; i++) {
			password[0 + 4 * i] = caps.charAt(random.nextInt(caps.length()));
			password[1 + 4 * i] = small.charAt(random.nextInt(small.length()));
			password[2 + 4 * i] = num.charAt(random.nextInt(num.length()));
			password[3 + 4 * i] = special.charAt(random.nextInt(special.length()));
		};
		
		return password;

	}

	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Hi "+employee.getFirstName()+", following are your credentials");
		System.out.println("Email : " + generateEmail(employee));
		System.out.println("Password : " + String.valueOf(generatePassword()));

	}

}
