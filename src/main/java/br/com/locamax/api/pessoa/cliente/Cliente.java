package main.java.br.com.locamax.api.pessoa.cliente;

import main.java.br.com.locamax.api.pessoa.Pessoa;
import java.util.ArrayList;

public class Cliente extends Pessoa {
    ArrayList<Integer> locacoes;
    public String endereco;
    public int idade;
    public char sexo;
    
    public Cliente(String nome, int mat, String end, int ida, char sex){
        super(nome, mat);
        this.locacoes = new ArrayList<>();
        this.endereco = end;
        this.idade = ida;
        this.sexo = sex;
    }

    public ArrayList<Integer> getLocacoes() {
        return locacoes;
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