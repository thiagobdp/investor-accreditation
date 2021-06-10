package br.com.investoraccreditation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserAccreditation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String userId;
	private Boolean accreditaded;

	public UserAccreditation() {
		super();
	}

	public UserAccreditation(String userId, Boolean accreditaded) {
		super();
		this.userId = userId;
		this.accreditaded = accreditaded;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Boolean getAccreditaded() {
		return accreditaded;
	}

	public void setAccreditaded(Boolean accreditaded) {
		this.accreditaded = accreditaded;
	}

}
