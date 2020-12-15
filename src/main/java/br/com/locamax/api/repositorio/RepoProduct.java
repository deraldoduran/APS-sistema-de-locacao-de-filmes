package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.produto.Produto;
import main.java.br.com.locamax.api.produto.filme.*;
import main.java.br.com.locamax.api.produto.musica.*;

import java.util.HashMap;

public class RepoProduct {
    HashMap<String, Produto> mapProduto;

    public RepoProduct(){
        this.mapProduto = new HashMap<String, Produto>();
    }

    public void addBluRay(BluRay b){
        this.mapProduto.put(b.getCodigo(), b);
        System.out.println(b.toString());
    }

    public void addDVD(DVD d){
        this.mapProduto.put(d.getCodigo(), d);
        System.out.println(d.toString());
    }

    public void addVHS(VHS v){
        this.mapProduto.put(v.getCodigo(), v);
        System.out.println(v.toString());
    }

    public void addCD(CD c){
        this.mapProduto.put(c.getCodigo(), c);
        System.out.println(c.toString());
    }

    public void addLP(LP l){
        this.mapProduto.put(l.getCodigo(), l);
        System.out.println(l.toString());
    }
}