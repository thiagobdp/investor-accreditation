package br.com.investoraccreditation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.InvestorAccreditation;

public interface InvestorAccreditationRepository extends JpaRepository<InvestorAccreditation, Long> {

	
	List<InvestorAccreditation> findByUserId(Integer userId);

}
