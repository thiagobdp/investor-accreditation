package br.com.investoraccreditation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.investoraccreditation.controller.dto.UserAccreditationDto;
import br.com.investoraccreditation.controller.form.UserAccreditationForm;
import br.com.investoraccreditation.model.UserAccreditation;
import br.com.investoraccreditation.repository.UserAccreditationRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserAccreditationRepository userAccreditationRepository;

	/**
	 * Receives documents to accreditate an investor. In the first request to a new
	 * user_id, save the user (investor) as accreditated=true. In the other requests
	 * for an existing user_id, it reverses the previous value of boolean
	 * accreditated
	 * 
	 * @param user
	 * @return Success: always true.
	 */
	@Transactional
	@PostMapping(path = "accreditation", consumes = { "application/json" })
	public UserAccreditationDto accreditation(@RequestBody @Valid UserAccreditationForm userForm) {

		UserAccreditation userAcc = userAccreditationRepository.findByUserId(userForm.getUser_id());
		if (userAcc == null) {
			userAcc = userAccreditationRepository.save(new UserAccreditation(userForm.getUser_id(), true));
		} else {
			// reverses the value
			userAcc.setAccreditaded(!userAcc.getAccreditaded());
		}

		return new UserAccreditationDto(true, userAcc.getAccreditaded());
	}

}
