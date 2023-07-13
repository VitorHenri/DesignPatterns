package jokenpo.model;

import java.util.Arrays;
import java.util.List;

public class Papel extends Algoritmo{

	@Override
	public List<Algoritmo> getFalhas() {
		return Arrays.asList(new Tesoura(),new Lagarto());
	}

	@Override
	public String getNomeAlgoritmo() {
		return "Papel";
	}

}
