package main.java.br.com.locamax.api.sistema;

import main.java.br.com.locamax.api.pessoa.funcionario.*;
import main.java.br.com.locamax.api.repositorio.*;

public class Sistema {
    private RepoPerson rPerson;
    private RepoProduct rProduct;
    private RepoRent rRent;

    public Sistema() {
        this.rPerson = new RepoPerson();
        this.rProduct = new RepoProduct();
        this.rRent = new RepoRent();
    };
    
    public RepoPerson getrPerson(){
        return rPerson;
    }

    public RepoProduct getrProduct(){
        return rProduct;
    }

    public RepoRent getrRent() {
        return rRent;
    }

    public void addGerente(String nom, int mat, String log, String sen, RepoProduct rPro){
        Gerente g = new Gerente(nom, mat, log, sen, rPro);
        this.rPerson.addGerente(g);
    }
}