package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.pessoa.*;

import java.util.HashMap;
import java.util.Set;

public class RepoPerson {
    HashMap<Integer, Pessoa> mapPerson;
    int id = 0;

    public RepoPerson() {
        this.mapPerson = new HashMap<Integer, Pessoa>();
    }

    public HashMap<Integer, Pessoa> getmapPerson(){
        return mapPerson;
    }

    public int getId() {
        return id;
    }

    public Pessoa getPerson(Integer matricula){
        Set<Integer> keys = mapPerson.keySet();
        try {
            for(Integer key : keys)
                if(key != null)
                    if(key == matricula)
                        return mapPerson.get(key);
            throw new Exception("Usuário de matrícula \"" + matricula +  "\" não existe");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public void addPerson(Pessoa p){
        mapPerson.put(p.matricula, p);
        this.id++;
        System.out.println(p.toString());
    }

    public boolean findPerson(int mat){
        Pessoa p = getPerson(mat);
        if(p != null){
            System.out.println(p.toString());
            return true;
        }
        return false;
    }
}