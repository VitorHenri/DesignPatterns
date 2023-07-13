package main;

import java.util.List;

import entities.Contato;
import repositories.ContatoRepository;
import service.ContatoService;

public class Principal {
	public static void main(String[] args) {
		Contato contato = new Contato("Vitor Henrique","vitor@gmail.com","19994931847");
		ContatoService cService = new ContatoService();
		List<Contato> contatos = cService.getContatos();
		contatos.forEach(c -> {
				c.setEmail("novoemail");
				cService.atualizar(c);
		});
		contatos.forEach(c->System.out.println(c.getEmail()));
		cService.closeService();
	}
}
