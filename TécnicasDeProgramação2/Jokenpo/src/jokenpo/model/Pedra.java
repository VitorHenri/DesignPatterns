package jokenpo.model;

import java.util.Arrays;
import java.util.List;

public class Pedra extends Algoritmo{

	@Override
	public List<Algoritmo> getFalhas() {
		return Arrays.asList(new Spock(),new Papel());
	}

	@Override
	public String getNomeAlgoritmo() {
		return "Pedra";
	}
	
}
