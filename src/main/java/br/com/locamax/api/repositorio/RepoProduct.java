package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.produto.Produto;
// import main.java.br.com.locamax.api.produto.filme.*;
// import main.java.br.com.locamax.api.produto.musica.*;

import java.util.HashMap;
import java.util.Set;

public class RepoProduct {
    HashMap<String, Produto> mapProduct;
    int id = 0;

    public RepoProduct(){
        this.mapProduct = new HashMap<String, Produto>();
    }

    public HashMap<String, Produto> getMapProduct() {
        return mapProduct;
    }

    public int getId() {
        return id;
    }

    public Produto getProduct(String cod){
        Set<String> keys = mapProduct.keySet();
        try {
            for(String key : keys)
                if(key != null)
                    if((key).contentEquals(cod))
                        return mapProduct.get(key);
            throw new Exception("Produto de código \"" + cod +  "\" não existe");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void addProduct(Produto p){
        this.mapProduct.put(p.getCodigo(), p);
        this.id++;
        System.out.println(p.toString());
    }

    public void listProduto(){
        for(Produto pro : mapProduct.values()){
            System.out.println(pro.toString());
        }
    }

    public void findProduto(String cod){
        Produto p = getMapProduct().get(cod);
        if(p != null)
            System.out.println(p.toString());
    }
}