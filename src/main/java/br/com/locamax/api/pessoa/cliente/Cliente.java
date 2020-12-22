package main.java.br.com.locamax.api.pessoa.cliente;

import main.java.br.com.locamax.api.pessoa.Pessoa;

public class Cliente extends Pessoa {
    public String endereco;
    public int idade;
    public char sexo;

    public Cliente(String nome, int mat, String end, int ida, char sex){
        super(nome, mat);
        this.endereco = end;
        this.idade = ida;
        this.sexo = sex;
    }

    public String toString(){
        return
            "nome: " + this.nome + "\n" +
            "matrícula: " + this.matricula + "\n" +
            "endereço: " + this.endereco + "\n" +
            "idade: " + this.idade + "\n" +
            "sexo: " + this.sexo + "\n";
    }
}