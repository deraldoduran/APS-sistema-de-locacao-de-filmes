package main.java.br.com.locamax.api.produto.musica;

import main.java.br.com.locamax.api.produto.Produto;

public abstract class Musica extends Produto{
    public String autor;
    public int numFaixas;
    
    public Musica(String cod, String tit, String gen, String aut, int num) {
        super(cod, tit, gen);
        this.autor = aut;
        this.numFaixas = num;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
}
