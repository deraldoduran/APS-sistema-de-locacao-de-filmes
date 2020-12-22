package main.java.br.com.locamax.api.login;

import main.java.br.com.locamax.api.repositorio.RepoPerson;
import main.java.br.com.locamax.api.pessoa.Pessoa;
import main.java.br.com.locamax.api.pessoa.funcionario.Funcionario;

public class GerenciadorDeLogin {
    public RepoPerson rPerson;
    public Pessoa p_logged = null;

    public GerenciadorDeLogin(RepoPerson rPer){
        this.rPerson = rPer;
    }

    public Pessoa getFLogged(){
        return this.p_logged;
    }

    public void setFLogged(Pessoa p){
        this.p_logged = p;
    }

    public void login(String tipo, String login, String senha){
        try {
            Funcionario f = (Funcionario)rPerson.getPerson(Integer.parseInt(login));
            if(!tipo.contentEquals(f.getClass().getSimpleName()))
                throw new Exception("Este login não tem permissões de " + tipo);
            if(senha.contentEquals(f.getSenha()))
                this.p_logged = f;
            else
                throw new Exception("Senha inválida");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean testLogged(){
        return (this.p_logged != null) ? true : false;
    }

    public boolean logout(){
        try {
            if(this.p_logged != null){
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