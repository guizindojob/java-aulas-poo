package br.sesi.file;

import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Aluno\\Desktop\\guilherme\\java-projects\\git-repos\\java-aulas-poo\\file.txt";
        ManipuladorArquivo arquivo = new ManipuladorArquivo();
        arquivo.leitor(path);
    }
}
