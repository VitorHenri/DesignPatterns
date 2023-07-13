package jokenpo.model;

import java.util.Arrays;
import java.util.List;

public class Lagarto extends Algoritmo{

	@Override
	public List<Algoritmo> getFalhas() {
		return Arrays.asList(new Tesoura(),new Pedra());
	}

	@Override
	public String getNomeAlgoritmo() {
		return "Lagarto";
	}

}
