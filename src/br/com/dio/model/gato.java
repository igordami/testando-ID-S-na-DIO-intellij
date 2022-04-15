package br.com.dio.model;

import java.util.Objects;

public class gato {
    private String cor ;
    private String nome ;
    private int idade ;

    public gato() {
    }

    public gato(String cor, String nome, int idade) {
        this.cor = cor;
        this.nome = nome;
        this.idade = idade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        gato gato = (gato) o;
        return idade == gato.idade && Objects.equals(cor, gato.cor) && Objects.equals(nome, gato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, nome, idade);
    }

    @Override
    public String toString() {
        return "gato{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
