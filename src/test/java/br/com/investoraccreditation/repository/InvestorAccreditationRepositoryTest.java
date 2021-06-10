package br.com.investoraccreditation.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase (replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles ("test")
public class InvestorAccreditationRepositoryTest {

	@Autowired
	private InvestorAccreditationRepository repository;
	
	@Autowired
	private TestEntityManager em;
	
	@Test
	public void findByUserId() {
		
	}
	
	@Test
	public void findByNotExistingUserId() {
		
	}

}
