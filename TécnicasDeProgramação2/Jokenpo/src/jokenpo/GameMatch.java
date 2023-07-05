package jokenpo;

public class GameMatch {
	private Jogador player1;
	private Jogador player2;
	
	
	public GameMatch(Jogador player1,Jogador player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public String processarPartida() {
		if(player1.getJogada().getFraquezas().contains(player2.getJogada().name()))
			return "player 2 ganhou partida com "+player2.getJogada();
		else if(player2.getJogada().getFraquezas().contains(player1.getJogada().name()))
			return "player 1 ganhou partida com "+player1.getJogada();
		else 
			return "Empate";
	}
	
}	
