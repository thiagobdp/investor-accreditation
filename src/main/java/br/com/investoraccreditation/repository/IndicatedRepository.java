package br.com.investoraccreditation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.Indicated;

public interface IndicatedRepository extends JpaRepository<Indicated, Long> {

	List<Indicated> findByYear(Integer year);

}
