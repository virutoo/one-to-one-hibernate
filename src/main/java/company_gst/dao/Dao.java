package company_gst.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import company_gst.dto.Gst;

public class Dao {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();

	public void saveGst(Gst gst) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(gst);
		entityManager.persist(gst.getCompany());
		transaction.commit();
	}
	
	public Gst getGstById(int id) {
		return entityManager.find(Gst.class, id);
	}

}
