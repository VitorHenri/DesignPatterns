package repositories;

import java.util.List;

import javax.persistence.EntityManager;

import entities.Contato;
import infra.EntityFactory;

public class ContatoRepository implements IContatoRepository {
	EntityManager em; 
	
	public ContatoRepository() {
		em =EntityFactory.getEntityManager();
		em.getTransaction().begin();
	}

	public void salvar(Contato contato) {
		em.persist(contato);
		em.getTransaction().commit();
	}

	public void atualizar(Contato contato) {
		em.persist(contato);
	}

	public List<Contato> getContatos(){
		String query = "FROM Contato C";
		List<Contato> retorno =  em.createQuery(query).getResultList();
		return retorno;
	}
	
	public void closeTransaction() {
		em.getTransaction().commit();
		em.close();
	}

}
