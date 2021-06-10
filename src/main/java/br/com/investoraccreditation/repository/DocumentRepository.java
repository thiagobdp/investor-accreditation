package br.com.investoraccreditation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
