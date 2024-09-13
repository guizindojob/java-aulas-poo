package br.sesi.gla.poo.tronco;

public class Tronco {
    public Braco bracodireito;
    public Braco bracoesquerdo;

    public Tronco() {
        this.bracoesquerdo = new Braco();
        this.bracodireito = new Braco();
    }
}
