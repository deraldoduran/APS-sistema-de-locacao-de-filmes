package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.repositorio.RepoPerson;
import main.java.br.com.locamax.api.repositorio.RepoRent;

public class Operador extends Funcionario {
    RepoPerson rPerson;
    RepoRent rRent;

    public Operador (String nome, int mat, String senha, RepoPerson rPer, RepoRent rRent){
        super(nome, mat, senha);
        this.rPerson = rPer;
        this.rRent = rRent;
    }

    public String toString(){
        return
            "nome: " + this.nome + "\n" +
            "matrícula: " + this.matricula + "\n" +
            "login: " + this.login + "\n";
            // "senha: " + this.senha + "\n";
    }
}