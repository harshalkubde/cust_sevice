package com.Customer.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.Customer.enums.ServicePlan;
import com.Customer.model.Customer;
import validationrule.ValidationRule;

public class Tester {

	public static LocalDate parseDate(String dateString) {
		// Define the format of the input date string
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		// Parse the date string using the defined format
		return LocalDate.parse(dateString, formatter);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("enter customer databases size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Customer[] c = new Customer[size];
		boolean exit = false;
		int i = 0;

		while (!exit) {
			System.out.println("Menu");
			System.out.println("1.signup 2.display 3.exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the fname");
				String f = sc.next();
				ValidationRule.validateName(f, "firstname");
				System.out.println("enter the lname");
				String l = sc.next();
				ValidationRule.validateName(l, "lastname");
				System.out.println("enter the email");
				String e = sc.next();
				ValidationRule.validateEmail(e);
				System.out.println("enter thr password");
				String p = sc.next();
				ValidationRule.validatePassword(e);
				System.out.println("enter the reg_amount");
				double r = sc.nextDouble();
				ValidationRule.validateRegAmount(r);
				System.out.println("enter the dob");
				LocalDate d = parseDate(sc.next());
				ValidationRule.validateDateOfBirth(d);
				System.out.println("enter the s_plan");
//				ServicePlan s = ServicePlan.valueOf(sc.next());
//				ValidationRule.validateServicePlan(s);
				c[i++] = new Customer(f, l, e, p, r, d/*ServicePlan.valueOf("GOLD")*/);
				break;

			case 2:
				System.out.println("display");
				for (Customer t : c) {
					if (t != null) {
						System.out.println(t.toString());
						break;
					}
				}
			case 3:
				System.out.println("exit");
				break;

			}

		}

	}

}
