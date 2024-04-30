package validationrule;

import java.time.LocalDate;

import com.Customer.enums.ServicePlan;

public class ValidationRule {



	public static String validateName(String name, String fieldName) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException(fieldName + " cannot be empty.");
		}
		return name.trim();
	}

	public static String validateEmail(String email) {
		if (email == null || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
			throw new IllegalArgumentException("Invalid email format.");
		}
		return email;
	}

	public static String validatePassword(String password) {
		// Add validation logic for password if needed
		return password;
	}

	public static double validateRegAmount(double regAmount) {
		if (regAmount < 0) {
			throw new IllegalArgumentException("Registration amount cannot be negative.");
		}
		return regAmount;
	}

	public static LocalDate validateDateOfBirth(LocalDate dob) {
		try {
			return dob;
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format. Please enter the date in YYYY-MM-DD format.");
		}
	}

	public static ServicePlan validateServicePlan(ServicePlan plan) {
		try {
			return plan;
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid service plan.");
		}
	}
}
