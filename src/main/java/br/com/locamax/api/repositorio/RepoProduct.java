package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.produto.Produto;
import java.util.HashMap;

public class RepoProduct {
    HashMap<Integer, Produto> mapProduto;

    public RepoProduct(){
        this.mapProduto = new HashMap<Integer, Produto>();
    }
}