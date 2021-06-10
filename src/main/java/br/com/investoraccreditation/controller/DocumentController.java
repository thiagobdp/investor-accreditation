package br.com.investoraccreditation.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.investoraccreditation.controller.dto.DocumentDto;
import br.com.investoraccreditation.controller.dto.UserAccreditationDto;
import br.com.investoraccreditation.controller.form.UserAccreditationForm;
import br.com.investoraccreditation.model.Document;
import br.com.investoraccreditation.model.UserAccreditation;
import br.com.investoraccreditation.repository.DocumentRepository;
import br.com.investoraccreditation.repository.PayloadRepository;
import br.com.investoraccreditation.repository.UserAccreditationRepository;

@RestController
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	UserAccreditationRepository userAccreditationRepository;

	@Autowired
	PayloadRepository payloadRepository;

	@Autowired
	DocumentRepository documentRepository;

	
	@Transactional
	@GetMapping
	public List<DocumentDto> document() {
		
		List<Document> docLst = documentRepository.findAll();

		return docLst.stream().map(d -> new DocumentDto(d)).collect(Collectors.toList());
	}

}
