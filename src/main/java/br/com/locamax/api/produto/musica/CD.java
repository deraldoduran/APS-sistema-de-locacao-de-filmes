package main.java.br.com.locamax.api.produto.musica;

public class CD extends Musica{
    public boolean arranhado, duplo;

    public CD(String cod, String tit, String gen, String aut, int numF, boolean dup, boolean arr) {
        super(cod, tit, gen, aut, numF);
        this.duplo = dup;
        this.arranhado = arr;
    }

    public String toString(){
        return "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "autor: " + this.autor + "\n" +
            "numero de faixas: " + this.numFaixas + "\n" +
            "duplo: " + this.duplo + "\n" +
            "arranhado: " + this.arranhado + "\n" + 
            "locado: " + this.locado;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
}
