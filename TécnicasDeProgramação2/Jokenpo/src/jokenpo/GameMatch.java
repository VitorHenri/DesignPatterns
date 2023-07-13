package jokenpo;

import jokenpo.model.Algoritmo;

public class GameMatch {
	private Algoritmo algoritmo;

	public String processarJogo(Algoritmo algoritmo) {
		return algoritmo.processarAlgoritmoVencedor(algoritmo);
	}
	
}	
