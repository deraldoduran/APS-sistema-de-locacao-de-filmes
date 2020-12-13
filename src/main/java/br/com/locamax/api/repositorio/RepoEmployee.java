package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.pessoa.funcionario.*;

import java.util.HashMap;
import java.util.Set;

public class RepoEmployee {
    HashMap<String, Funcionario> mapFuncionario;

    public RepoEmployee() {
        this.mapFuncionario = new HashMap<String, Funcionario>();
    }

/*     public HashMap<Integer, Funcionario> getMapFuncionarios() {
        return mapFuncionarios;
    }

    public void setMapFuncionarios(HashMap<Integer, Funcionario> mapFuncionarios) {
        this.mapFuncionarios = mapFuncionarios;
    } */

    public Funcionario getFuncionario(String login) {
        Set<String> keys = mapFuncionario.keySet();
        try {
            for(String key : keys) {
            if(key != null)
                if(key.contentEquals(login))
                    return mapFuncionario.get(key);
            }
            throw new Exception("Usuário \"" + login +  "\" não cadastrado");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public boolean addFuncionario(Funcionario f){
        mapFuncionario.put(f.login, f);
        return true;
    }

    public boolean addGerente(Gerente g){
        mapFuncionario.put(g.login, g);
        return true;
    }
}