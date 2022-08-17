package human_brain.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import human_brain.dto.Human;

public class HumanDao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveHuman(Human human) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(human);
		entityManager.persist(human.getBrain());
		transaction.commit();
	}

}
