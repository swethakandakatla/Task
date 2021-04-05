package uk.task.waracle.cakemanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import uk.task.waracle.cakemanagement.model.Cake;
import uk.task.waracle.cakemanagement.repository.CakeRepository;

@DataJpaTest
public class CakeTests {
	
	@Autowired
	private CakeRepository cakeRepo;
	
	@Test
	public void testCreateCake() {
		Cake cake = new Cake("ButterScotch","WithEgg",55);
		cakeRepo.save(cake);
	}
	
}
