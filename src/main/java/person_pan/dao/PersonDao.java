package person_pan.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import person_pan.dto.Person;

public class PersonDao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager manager = factory.createEntityManager();
	
	public void savePerson(Person person) {
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(person);
		manager.persist(person.getPan());
		transaction.commit();
	}
	
	public Person getPersonById(int id) {
		return manager.find(Person.class, id);
	}

}
