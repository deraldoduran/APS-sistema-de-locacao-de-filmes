package main.java.br.com.locamax.api.produto.musica;

import main.java.br.com.locamax.api.produto.Produto;

public abstract class Musica extends Produto {
    public String autor;
    public int numFaixas;
    
    public Musica(String cod, String tit, String gen, String aut, int numF, Float valD){
        super(cod, tit, gen, valD);
        this.autor = aut;
        this.numFaixas = numF;
    }

    public String toString(){
        return
            "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "autor(es): " + this.autor + "\n" +
            "nº de faixas: " + this.numFaixas + "\n" +
            "valor ao dia: " + this.valDiaria + "\n";
    }

    @Override
    public double calcularDiaria(){
        return 0;
    }
}
