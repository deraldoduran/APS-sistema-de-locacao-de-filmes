package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.locacao.Locacao;

import java.util.HashMap;
import java.util.Set;

public class RepoRent {
    int id = 0;
    HashMap<Integer, Locacao> mapRent; //mat, 

    public RepoRent(){
        this.mapRent = new HashMap<Integer, Locacao>();
    }

    public int getId() {
        return id;
    }

    public void addRent(Locacao l){
        mapRent.put(id, l);
        this.id++;
        System.out.println(l.toString());
    }

    public Locacao getRent(Integer id){
        Set<Integer> keys = mapRent.keySet();
        try {
            for(Integer key : keys)
                if(key != null)
                    if(key == id)
                        return mapRent.get(key);
            throw new Exception("Locacação de id \"" + getId() +  "\" não existe");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void findRent(int id){
        Locacao l = mapRent.get(id);
        if(l != null)
            System.out.println(l.toString());
    }

    public void listRent(){
        for(Locacao rent : mapRent.values()){
            System.out.println(rent.toString());
        }
    }

    public void remRent(int id){
        mapRent.remove(id);
    }
}