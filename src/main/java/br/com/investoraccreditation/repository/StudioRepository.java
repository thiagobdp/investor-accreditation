package br.com.investoraccreditation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.Studio;

public interface StudioRepository extends JpaRepository<Studio, Long> {

}
