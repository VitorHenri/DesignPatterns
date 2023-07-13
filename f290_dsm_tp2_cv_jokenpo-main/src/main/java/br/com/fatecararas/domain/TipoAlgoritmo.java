package br.com.fatecararas.domain;

import java.util.Arrays;

public enum TipoAlgoritmo {
    PAPEL(1,new Papel()),
    TESOURA(2,new Tesoura()),
    PEDRA(3,new Pedra()),
    LAGARTO(4,new Lagarto()),
    SPOCK(5,new Spock());

    private Integer id;
    private Algoritmo algoritmo;
    
    public Integer getId() {
        return id;
    }
    
    public Algoritmo getAlgoritmo() {
        return algoritmo;
    }

    TipoAlgoritmo(Integer id,Algoritmo algoritmo) {
        this.id = id;
        this.algoritmo = algoritmo;
    }

    public static TipoAlgoritmo getTipo(Integer id) {
        return Arrays.stream(TipoAlgoritmo.values())
                .filter(t -> t.id.equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Id inválido. ID: " + id));
    }
}
