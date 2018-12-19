package repo;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.parsons.elliott.garageDatabase.mySpringBootGarageDatabase.MySpringBootGarageDatabaseApplication;
import com.parsons.elliott.garageDatabase.mySpringBootGarageDatabase.model.MySpringBootDataModel;
import com.parsons.elliott.garageDatabase.mySpringBootGarageDatabase.repository.MySpringBootRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {MySpringBootGarageDatabaseApplication.class})
@DataJpaTest
public class RepositoryTest { 
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private MySpringBootRepository myRepo;
	
	@Test
	public void retrieveByIdTest() {
		MySpringBootDataModel model1 = new MySpringBootDataModel("Bob","Space",50);
		entityManager.persist(model1); 
		entityManager.flush();  
		assertTrue(myRepo.findById(model1.getId()).isPresent());
	}
}
