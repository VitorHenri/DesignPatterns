package jokenpo.model;

import java.util.List;

public abstract class Algoritmo {
	
	public abstract List<Algoritmo> getFalhas();
	
	public abstract String getNomeAlgoritmo();
	
	public String processarAlgoritmoVencedor(Algoritmo algoritmoRival) {
		if(this.getFalhas().contains(algoritmoRival))
			return "Vencedor: "+algoritmoRival.getNomeAlgoritmo() + " derrotou "+ this.getNomeAlgoritmo();
		else if(algoritmoRival.getFalhas().contains(this))
			return "Vencedor: "+this.getNomeAlgoritmo() + " derrotu " + algoritmoRival.getNomeAlgoritmo();
			
		return "Empate";
	}
}
