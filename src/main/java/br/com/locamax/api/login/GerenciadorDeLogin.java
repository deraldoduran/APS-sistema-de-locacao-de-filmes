package main.java.br.com.locamax.api.login;

import main.java.br.com.locamax.api.repositorios.RepoEmployee;
import main.java.br.com.locamax.api.pessoa.funcionario.*;

public class GerenciadorDeLogin {
    // private RepoEmployee repoEmployee;
    private Funcionario f_logged = null;

    public GerenciadorDeLogin(){
        // this.repoEmployee = new RepoEmployee();
    }

    public Funcionario getFLogged(){
        return this.f_logged;
    }

    public void setFLogged(Funcionario f){
        this.f_logged = f;
    }

    public Funcionario login(String login, String senha){
        try {
            Funcionario f = repoEmployee.getFuncionario(login);

            if(login.contentEquals(f.login))
                if(login.contentEquals(f.senha))
                    return f;
            throw new Exception("Senha inválida");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public boolean testLogged(){
        return (f_logged != null) ? true : false;
    }

    public boolean logout(){
        try {
            if(testLogged()){
                f_logged = null;
                return true;
            }
            throw new Exception("Você não está logado");
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}