package br.com.fatecararas.domain;

public class Pedra extends Algoritmo {

	@Override
	public String executar(TipoAlgoritmo tipo) {
		switch (tipo) {
		case PAPEL -> {
			return "Perdeu! Papel empara com papel";
		}
		case TESOURA -> {
			return "Ganhou! Pedra quebra o papel!";
		}
		case PEDRA -> {
			return "Empate! Papel empara com papel!";
		}
		case LAGARTO -> {
			return "Ganhou! Pedra mata lagarto";
		}
		case SPOCK -> {
			return "Perdeu! SPOCK desintegra pedra";
		}
		default -> {
			return "Empatou! Tipo inválido";
		}
		}
	}

}
