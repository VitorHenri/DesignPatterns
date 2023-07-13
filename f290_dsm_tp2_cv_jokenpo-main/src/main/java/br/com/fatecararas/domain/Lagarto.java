package br.com.fatecararas.domain;

public class Lagarto extends Algoritmo{

	@Override
	public String executar(TipoAlgoritmo tipo) {
		switch (tipo) {
		case PAPEL -> {
			return "Ganhou! Papel é comido por Lagarto";
		}
		case TESOURA -> {
			return "Perdeu! Tesoura decapita o lagarto!";
		}
		case PEDRA -> {
			return "Perdeu! Pedra esmaga Lagarto!";
		}
		case LAGARTO -> {
			return "Empate! Lagarto vs Lagarto";
		}
		case SPOCK -> {
			return "Ganhou! Lagarto envenena Spock";
		}
		default -> {
			return "Empatou! Tipo inválido";
		}
		}
	}

}
