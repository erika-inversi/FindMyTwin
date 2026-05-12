package com.erikainversi.findmytwin;

public class ValidationResult {

	private final ValidationStatus validationStatus;
	private final String message;

	public ValidationResult(ValidationStatus validationStatus, String message) {
		this.validationStatus = validationStatus;
		this.message = message;
	}

	public ValidationStatus getValidationStatus() {
		return validationStatus;
	}

	public String getMessage() {
		return message;
	}

}
