package service;

import java.util.List;

import entities.Contato;
import repositories.ContatoRepository;

public class ContatoService {
	
	ContatoRepository cRepository;
	
	public ContatoService() {
		this.cRepository = new ContatoRepository();
	}
	
	public void salvar(Contato contato) {
		if(contato.getTelefone().isBlank())
			throw new RuntimeException("Necessário informar telefone de contato");
		cRepository.salvar(contato);
	}
	
	public void atualizar(Contato contato) {
		cRepository.atualizar(contato);
	}
	
	public List<Contato> getContatos(){
		return cRepository.getContatos();
	}
	
	public void closeService() {
		cRepository.closeTransaction();
	}

}
