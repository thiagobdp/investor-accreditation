package br.com.investoraccreditation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.Payload;

public interface PayloadRepository extends JpaRepository<Payload, Long> {

}
