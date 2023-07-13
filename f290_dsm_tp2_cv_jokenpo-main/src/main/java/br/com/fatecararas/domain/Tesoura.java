package br.com.fatecararas.domain;

public class Tesoura extends Algoritmo{

	@Override
	public String executar(TipoAlgoritmo tipo) {
		switch (tipo) {
		case PAPEL -> {
			return "Ganhou! Tesoura corta papel";
		}
		case TESOURA -> {
			return "Empate! Tesoura vs Tesoura!";
		}
		case PEDRA -> {
			return "Perdeu! Pedra quebra tesoura!";
		}
		case LAGARTO -> {
			return "Ganhou! Tesoura decapita lagarto";
		}
		case SPOCK -> {
			return "Perdeu! SPOCK esmaga tesoura";
		}
		default -> {
			return "Empatou! Tipo inválido";
		}
		}
	}

}
