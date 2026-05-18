package com.erikainversi.findmytwin;

public class InputPathValidator {

	public ValidationResult validatePath(String path) {
		// checks on path
		// decides VALID or INVALID
		// creates validationResult
		// returns

		if (path == null || path.isEmpty()) {
			return new ValidationResult(ValidationStatus.INVALID_PATH_FORMAT, "Path cannot be empty");
		}
		return new ValidationResult(ValidationStatus.VALID_PATH_FORMAT, "Path is valid");
	}

}
