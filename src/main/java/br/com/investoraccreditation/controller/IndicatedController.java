package br.com.investoraccreditation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.investoraccreditation.controller.dto.IndicatedDto;
import br.com.investoraccreditation.model.Indicated;
import br.com.investoraccreditation.repository.IndicatedRepository;

@RestController
@RequestMapping("/indicated")
public class IndicatedController {

	@Autowired
	private IndicatedRepository indicatedRepository;

	/**
	 * List all indicateds
	 * 
	 * @return
	 */
	@GetMapping
	public List<IndicatedDto> indicated() {
		List<Indicated> indicateds = indicatedRepository.findAll();
		return IndicatedDto.converter(indicateds);
	}

}
