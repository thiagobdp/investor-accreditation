package br.com.useraccreditation.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

public class DocumentForm {

	@ApiModelProperty(value="Name of the document")
	@NotNull
	@NotEmpty
	private String name;

	@ApiModelProperty(value="MimeType of the document")
	@NotNull
	@NotEmpty
	private String mime_type;

	@ApiModelProperty(value="The document itself")
	@NotNull
	@NotEmpty
	private String content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMime_type() {
		return mime_type;
	}

	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
