package br.com.investoraccreditation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.UserAccreditation;

public interface UserAccreditationRepository extends JpaRepository<UserAccreditation, Long> {

	
	List<UserAccreditation> findByUserId(Integer userId);

}
