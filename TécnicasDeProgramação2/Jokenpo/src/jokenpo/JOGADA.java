package jokenpo;

import java.util.Arrays;
import java.util.List;

public enum JOGADA {
	TESOURA(Arrays.asList("PEDRA","SPOCK")),
	PAPEL(Arrays.asList("TESOURA","LAGARTO")),
	PEDRA(Arrays.asList("SPOCK","PAPEL")),
	LAGARTO(Arrays.asList("TESOURA","PEDRA")),
	SPOCK(Arrays.asList("PAPEL","LAGARTO"));
	
	List<String> fraquezas;
	
	public List<String> getFraquezas(){
		return fraquezas;
	}
	
	private JOGADA(List<String> fraquezas) {
		this.fraquezas = fraquezas;
	}
}
