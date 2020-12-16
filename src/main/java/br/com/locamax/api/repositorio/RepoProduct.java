package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.produto.Produto;
// import main.java.br.com.locamax.api.produto.filme.*;
// import main.java.br.com.locamax.api.produto.musica.*;

import java.util.HashMap;

public class RepoProduct {
    HashMap<String, Produto> mapProduto;

    public RepoProduct(){
        this.mapProduto = new HashMap<String, Produto>();
    }

    public void addProduct(Produto p){
        this.mapProduto.put(p.getCodigo(), p);
        System.out.println(p.toString());
    }
}