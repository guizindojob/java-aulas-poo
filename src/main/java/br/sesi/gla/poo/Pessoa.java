package br.sesi.gla.poo;

import br.sesi.gla.poo.cabeca.Cabeca;
import br.sesi.gla.poo.inferior.MembrosInferiores;
import br.sesi.gla.poo.tronco.Tronco;


public class Pessoa {
    public Cabeca cabeca;
    public Tronco tronco;
    public MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}
