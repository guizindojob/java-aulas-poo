package br.sesi.gla.poo;

import br.sesi.gla.poo.cabeca.Cabeca;
import br.sesi.gla.poo.cabeca.Olho;

public class Main {
    public static void main(String[] args) {
        Olho olho1 = new Olho();
        olho1.corIris = "azul";
        olho1.cego = true;
        olho1.diametroOlho = 2.0f;

        Olho olho2 = new Olho ();
        olho2.corIris = "verde";
        olho2.cego = false;
        olho2.diametroOlho = 2.5f;

        Cabeca cabeca = new Cabeca();
        cabeca.olhoEsquerdo = olho1;
        cabeca.olhoDireito = olho2;

        Pessoa pessoa1 = new Pessoa();

        pessoa1.cabeca = cabeca;

    }
}
