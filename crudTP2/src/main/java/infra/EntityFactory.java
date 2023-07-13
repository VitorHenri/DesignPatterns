package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityFactory {
	
	public static EntityManager getEntityManager() {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
			return emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
