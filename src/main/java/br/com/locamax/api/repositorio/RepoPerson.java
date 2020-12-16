package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.pessoa.*;
import main.java.br.com.locamax.api.pessoa.funcionario.Gerente;

import java.util.HashMap;
import java.util.Set;

public class RepoPerson {
    HashMap<String, Pessoa> mapPerson;

    public RepoPerson() {
        this.mapPerson = new HashMap<String, Pessoa>();
    }

    public HashMap<String, Pessoa> getmapPerson(){
        return mapPerson;
    }

    public Pessoa getPerson(String login){
        Set<String> keys = mapPerson.keySet();
        try {
            for(String key : keys)
                if(key != null)
                    if(key.contentEquals(login))
                        return mapPerson.get(key);
            throw new Exception("Usuário \"" + login +  "\" não cadastrado");
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean addGerente(Gerente g){
        mapPerson.put(g.login, g);
        return true;
    }
}