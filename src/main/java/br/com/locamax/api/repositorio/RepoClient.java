package main.java.br.com.locamax.api.repositorio;

import main.java.br.com.locamax.api.pessoa.cliente.Cliente;
import java.util.HashMap;

public class RepoClient {
    HashMap<Integer, Cliente> mapClient;

    public RepoClient() {
        this.mapClient = new HashMap<Integer, Cliente>();
    }

    public HashMap<Integer, Cliente> getMapClient() {
        return mapClient;
    }
}