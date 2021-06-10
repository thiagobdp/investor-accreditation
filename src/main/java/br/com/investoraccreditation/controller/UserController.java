package br.com.investoraccreditation.controller;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.investoraccreditation.controller.dto.UserAccreditationDto;
import br.com.investoraccreditation.controller.form.UserAccreditationForm;

@RestController
@RequestMapping("/user")
public class UserController {

	/**
	 * Receives documents to accreditate an investor
	 * 
	 * @param user
	 * @return Success: always true. Accredited: random true/false.
	 */
	@PostMapping(path = "accreditation", consumes = { "application/json" })
	public UserAccreditationDto accreditation(@RequestBody @Valid UserAccreditationForm user) {

		
		
		Random random = new Random();
		return new UserAccreditationDto(true, (random.ints(1, 0, 10).findFirst().getAsInt() % 2) == 0);
	}

}
