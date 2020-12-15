package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.pessoa.cliente.Cliente;
import main.java.br.com.locamax.api.locacao.Locacao;
import main.java.br.com.locamax.api.produto.Produto;

import java.util.ArrayList;
import java.util.Date;

public class Operador extends Funcionario {
    private ArrayList <Cliente> cliente;
    private ArrayList <Produto> produtoQualquer;
    private ArrayList <Locacao> locacao;

    public Operador (String nome, int mat, String log, String sen){
        super(nome, mat, log, sen);
        this.cliente = new ArrayList<>();
        this.produtoQualquer = new ArrayList<>();
        this.locacao = new ArrayList<>();
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public ArrayList<Produto> getProdutoQualquer() {
        return produtoQualquer;
    }

    public ArrayList<Locacao> getLocacao() {
        return locacao;
    }

    public String toString(){
        return
            "nome: " + this.nome + "\n" +
            "matrícula: " + this.matricula + "\n" +
            "login: " + this.login + "\n";
            // "senha: " + this.senha + "\n";
    }

    public void Locar(String c, String t, String g, boolean l, Date ds, Date ep, Date dd){
        locacao.add(new Locacao(c, t, g, ds, ep, dd));
    }
}