package main.java.br.com.locamax.api.sistema;

import main.java.br.com.locamax.api.login.GerenciadorDeLogin;
import main.java.br.com.locamax.api.pessoa.funcionario.*;
import main.java.br.com.locamax.api.repositorio.*;

public class Sistema {
    GerenciadorDeLogin gLogin;
    RepoClient rClient;
    RepoEmployee rEmployee;
    RepoProduct rProduct;

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

    public void addEmployee(String n, int m, String l, String s){
        Funcionario f = new Funcionario(n, m, l, s);
        this.rEmployee.addFuncionario(f);
    }
}


