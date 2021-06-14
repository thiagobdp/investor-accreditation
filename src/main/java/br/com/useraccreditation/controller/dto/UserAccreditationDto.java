package br.com.useraccreditation.controller.dto;

import io.swagger.annotations.ApiModelProperty;

public class UserAccreditationDto {

	@ApiModelProperty(value="If the Accreditation operation is executed successfully")
	private Boolean success;
	
	@ApiModelProperty(value="If the User was accredited or not")
	private Boolean accredited;

	public UserAccreditationDto(boolean success, boolean accredited) {
		this.success = success;
		this.accredited = accredited;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getAccredited() {
		return accredited;
	}

	public void setAccredited(Boolean accredited) {
		this.accredited = accredited;
	}

}
