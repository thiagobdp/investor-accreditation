package br.com.investoraccreditation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Long> {
	
	public List<Producer> findByName(String name);
	
}
