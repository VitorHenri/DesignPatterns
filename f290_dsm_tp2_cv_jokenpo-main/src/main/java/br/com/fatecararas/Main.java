package br.com.fatecararas;

import static br.com.fatecararas.domain.TipoAlgoritmo.getTipo;

import java.util.Random;
import java.util.Scanner;

import br.com.fatecararas.domain.Jokenpo;
import br.com.fatecararas.domain.TipoAlgoritmo;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();

        int computador = new Random().nextInt(5) + 1;

        TipoAlgoritmo algoritmoComputador = getTipo(computador);
        System.out.println("O COMPUTADOR escolheu: " + algoritmoComputador);

        var jokenpo = new Jokenpo();

        jokenpo.setAlgortimo(TipoAlgoritmo.getTipo(jogada).getAlgoritmo());
        jokenpo.jogar(algoritmoComputador);

        in.close();
    }
}