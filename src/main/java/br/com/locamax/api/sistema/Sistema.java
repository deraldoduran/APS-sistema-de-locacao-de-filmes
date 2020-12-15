package main.java.br.com.locamax.api.sistema;

import main.java.br.com.locamax.api.login.GerenciadorDeLogin;
import main.java.br.com.locamax.api.pessoa.funcionario.*;
import main.java.br.com.locamax.api.produto.filme.*;
import main.java.br.com.locamax.api.produto.musica.*;
import main.java.br.com.locamax.api.repositorio.*;

public class Sistema {
    GerenciadorDeLogin gLogin;
    RepoClient rClient;
    RepoEmployee rEmployee;
    RepoProduct rProduct;
    RepoProduct rLocacoes;

    public Sistema(){
        this.gLogin = new GerenciadorDeLogin();
        this.rClient = new RepoClient();
        this.rEmployee = new RepoEmployee();
        this.rProduct = new RepoProduct();
    };

    public GerenciadorDeLogin getgLogin() {
        return gLogin;
    }

    public RepoEmployee getrEmployee() {
        return rEmployee;
    }

    public RepoClient getrClient() {
        return rClient;
    }

    public RepoProduct getrProduct() {
        return rProduct;
    }

    public void addGerente(String nom, int mat, String log, String sen){
        Gerente g = new Gerente(nom, mat, log, sen);
        this.rEmployee.addGerente(g);
    }

    public void addBluRay(String cod, String tit, String gen, int ano, int dur, String idi, Boolean arr){
        BluRay b = new BluRay(cod, tit, gen, ano, dur, idi, arr);
        this.rProduct.addBluRay(b);
    }

    public void addDVD(String cod, String tit, String gen, int ano, int dur, boolean arr){
        DVD d = new DVD(cod, tit, gen, ano, dur, arr);
        this.rProduct.addDVD(d);
    }

    public void addVHS(String cod, String tit, String gen, int ano, int dur, boolean cor){
        VHS v = new VHS(cod, tit, gen, ano, dur, cor);
        this.rProduct.addVHS(v);
    }

    public void addCD(String cod, String tit, String gen, String aut, int numF, Boolean dup, Boolean arr){
        CD c = new CD(cod, tit, gen, aut, numF, dup, arr);
        this.rProduct.addCD(c);
    }

    public void addLP(String cod, String tit, String gen, String aut, int numF, Boolean rar){
        LP l = new LP(cod, tit, gen, aut, numF, rar);
        this.rProduct.addLP(l);
    }
}