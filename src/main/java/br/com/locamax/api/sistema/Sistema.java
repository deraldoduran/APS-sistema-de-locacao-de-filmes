package main.java.br.com.locamax.api.sistema;

import main.java.br.com.locamax.api.pessoa.funcionario.*;
import main.java.br.com.locamax.api.repositorio.*;

public class Sistema {
    private RepoClient rClient;
    private RepoEmployee rEmployee;
    private RepoProduct rProduct;
    // private RepoProduct rLocacoes;

    public Sistema() {
        this.rClient = new RepoClient();
        this.rEmployee = new RepoEmployee();
        this.rProduct = new RepoProduct();
        // this.rLocacoes = new RepoLocacoes();
    };
    
    public RepoClient getrClient(){
        return rClient;
    }

    public RepoEmployee getrEmployee(){
        return rEmployee;
    }

    public RepoProduct getrProduct(){
        return rProduct;
    }

    public void addGerente(String nom, int mat, String log, String sen, RepoProduct rPro){
        Gerente g = new Gerente(nom, mat, log, sen, rPro);
        this.rEmployee.addFuncionario(g);
    }
}