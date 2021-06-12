package br.com.useraccreditation.config.validation;

public class FormErrorDto {

	public String field;
	public String error;

	public FormErrorDto(String field, String error) {
		super();
		this.field = field;
		this.error = error;
	}

	public String getField() {
		return field;
	}

	public String getError() {
		return error;
	}

}
