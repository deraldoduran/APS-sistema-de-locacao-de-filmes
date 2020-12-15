package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.locacao.Locacao;
// import main.java.br.com.locamax.api.produto.filme.*;
// import main.java.br.com.locamax.api.produto.musica.*;

import java.util.HashMap;

public class RepoRent {
    HashMap<Integer, Locacao> mapProduto; //mat, Locacao

    public RepoRent(){
        this.mapProduto = new HashMap<Integer, Locacao>();
    }
}