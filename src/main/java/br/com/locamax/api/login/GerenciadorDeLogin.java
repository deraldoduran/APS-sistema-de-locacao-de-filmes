package main.java.br.com.locamax.api.login;

import main.java.br.com.locamax.api.repositorio.RepoEmployee;
import main.java.br.com.locamax.api.pessoa.funcionario.*;

public class GerenciadorDeLogin {
    private Funcionario f_logged = null;

    public GerenciadorDeLogin(){}

    public Funcionario getFLogged(){
        return this.f_logged;
    }

    public void setFLogged(Funcionario f){
        this.f_logged = f;
    }

    public void login(String tipo, String login, String senha, RepoEmployee rEmployee){
        try {
            Funcionario f = rEmployee.getFuncionario(login);
            if(!tipo.contentEquals(f.getClass().getSimpleName()))
                throw new Exception("Este login não tem permissões de " + tipo);
            if(senha.contentEquals(f.getSenha()))
                this.f_logged = f;
            else
                throw new Exception("Senha inválida");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean testLogged(){
        return (this.f_logged != null) ? true : false;
    }

    public boolean logout(){
        try {
            if(this.f_logged != null){
                this.setFLogged(null);
                return true;
            }
            throw new Exception("Você não está logado");
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}