package br.sesi.gla.poo.cabeca;

public class Cabeca {
    public Olho olhoEsquerdo;
    public Olho olhoDireito;
    public Olho orelhao;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.olhoEsquerdo = new Olho();
        this.olhoDireito = new Olho();
        this.orelhao = new Olho();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
