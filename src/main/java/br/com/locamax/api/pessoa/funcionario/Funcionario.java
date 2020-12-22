package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.pessoa.Pessoa;

public class Funcionario extends Pessoa {
    public String login;
    public String senha;

    public Funcionario(String n, int m, String s){
        super(n, m);
        this.login = String.valueOf(m);
        this.senha = s;
    }
    
    public String toString(){
        return
            "login: " + this.login + "\n" +
            "senha: " + this.senha + "\n";
    }
    
    public String getLogin(){
        return login;
    }

    public String getSenha(){
        return senha;
    }

}