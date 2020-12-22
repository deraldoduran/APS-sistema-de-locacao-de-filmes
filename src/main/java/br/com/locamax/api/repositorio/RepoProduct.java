package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.produto.Produto;
// import main.java.br.com.locamax.api.produto.filme.*;
// import main.java.br.com.locamax.api.produto.musica.*;

import java.util.HashMap;

public class RepoProduct {
    HashMap<String, Produto> mapProduto;
    int id = 0;

    public RepoProduct(){
        this.mapProduto = new HashMap<String, Produto>();
    }

    public int getId() {
        return id;
    }

    public void addProduct(Produto p){
        this.mapProduto.put(p.getCodigo(), p);
        this.id++;
        System.out.println(p.toString());
    }

    public void listProduto(){
        for(Produto pro : mapProduto.values()){
            System.out.println(pro.toString());
        }
    }

    public void findProduto(String p){
        for(Produto pro : mapProduto.values()){
            if(pro.toString().contains(p))
            System.out.println(pro.toString());
        }
    }
}