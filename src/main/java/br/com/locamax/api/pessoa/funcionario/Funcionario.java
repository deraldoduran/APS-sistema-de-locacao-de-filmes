package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.pessoa.Pessoa;

public class Funcionario extends Pessoa {
    public String login;
    public String senha;

    public Funcionario(String n, int m, String l, String s){
        super(n, m);
        this.login = l;
        this.senha = s;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String toString() {
        return this.login + " - " + this.senha;
    }
}