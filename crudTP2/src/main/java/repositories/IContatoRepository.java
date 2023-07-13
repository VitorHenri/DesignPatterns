package repositories;

import entities.Contato;

public interface IContatoRepository {
	public void salvar(Contato object);
	
	public void atualizar(Contato contato);
}
