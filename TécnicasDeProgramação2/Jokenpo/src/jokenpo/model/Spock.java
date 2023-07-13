package jokenpo.model;

import java.util.Arrays;
import java.util.List;

public class Spock extends Algoritmo{

	@Override
	public List<Algoritmo> getFalhas() {
		return Arrays.asList(new Papel(),new Lagarto());
	}

	@Override
	public String getNomeAlgoritmo() {
		return "Spock";
	}

}
