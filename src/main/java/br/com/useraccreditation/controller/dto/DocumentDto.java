package br.com.useraccreditation.controller.dto;

import br.com.useraccreditation.model.Document;
import io.swagger.annotations.ApiModelProperty;

public class DocumentDto {

	@ApiModelProperty(value="Document ID in database")
	private Long id;
	
	@ApiModelProperty(value="Name of the document")
	private String name;
	
	@ApiModelProperty(value="MimeType of the document")
	private String mimeType;
	
	@ApiModelProperty(value="The document itself")
	private String content;

	public DocumentDto(Document d) {
		super();
		this.id = d.getId();
		this.name = d.getName();
		this.mimeType = d.getMimeType();
		this.content = d.getContent();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMimeType() {
		return mimeType;
	}

	public String getContent() {
		return content;
	}

}
