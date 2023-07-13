package jokenpo.model;

import java.util.Arrays;
import java.util.List;

public class Tesoura extends Algoritmo{

	@Override
	public List<Algoritmo> getFalhas() {
		return Arrays.asList(new Pedra(),new Spock());
	}

	@Override
	public String getNomeAlgoritmo() {
		return "Tesoura";
	}

}
