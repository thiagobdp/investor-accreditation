package br.com.useraccreditation.controller.form;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;

public class UserAccreditationForm {

	@ApiModelProperty(value = "User ID in database")
	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String user_id;

	@ApiModelProperty(value = "Payload for accreditation")
	@NotNull
	@Valid
	private PayloadForm payload;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public PayloadForm getPayload() {
		return payload;
	}

	public void setPayload(PayloadForm payload) {
		this.payload = payload;
	}

}
