package jokenpo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sysIn = new Scanner(System.in);
		Jogador player1;
		Jogador player2;
		try {
			System.out.println("Player 1 digite sua jogada[TESOURA,PAPEL,PEDRA,SPOCK,LAGARTO]");
			player1 = new Jogador(JOGADA.valueOf(sysIn.next().toUpperCase().trim()));
			System.out.println("Player 2 digite sua jogada[TESOURA,PAPEL,PEDRA,SPOCK,LAGARTO]");
			player2 = new Jogador(JOGADA.valueOf(sysIn.next().toUpperCase().trim()));
			GameMatch gameMatch = new GameMatch(player1, player2);
			System.out.println(gameMatch.processarPartida());
		}catch(Exception e) {
			System.out.println("escolha inválida");
		}finally {
			if(sysIn!=null)
				sysIn.close();
		}
	}

}
