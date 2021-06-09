package br.com.investoraccreditation.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.investoraccreditation.model.Studio;

public class StudioDto {

	private Long id;
	private String name;

	public StudioDto(Studio s) {
		this.name = s.getName();
		this.id = s.getId();
	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public static List<StudioDto> converter(List<Studio> studios) {
		return studios.stream().map(StudioDto::new).collect(Collectors.toList());
	}

}
