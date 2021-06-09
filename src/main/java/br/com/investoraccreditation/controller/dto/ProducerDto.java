package br.com.investoraccreditation.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.investoraccreditation.model.Producer;

public class ProducerDto {

	private Long id;
	private String name;

	public ProducerDto(Producer p) {
		this.name = p.getName();
		this.id = p.getId();
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public static List<ProducerDto> converter(List<Producer> producers) {
		return producers.stream().map(ProducerDto::new).collect(Collectors.toList());
	}

}
