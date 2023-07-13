package br.com.fatecararas.domain;

public class Spock extends Algoritmo{

	@Override
	public String executar(TipoAlgoritmo tipo) {
		switch (tipo) {
		case PAPEL -> {
			return "Perdeu! Papel desaprova Spock";
		}
		case TESOURA -> {
			return "Ganhou! Spock quebra a tesoura!";
		}
		case PEDRA -> {
			return "Ganhou! Spock desintegra pedra!";
		}
		case LAGARTO -> {
			return "Perdeu! Lagarto envenena Spock";
		}
		case SPOCK -> {
			return "Empate! SPOCK vs SPOCK";
		}
		default -> {
			return "Empatou! Tipo inválido";
		}
		}
	}

}
