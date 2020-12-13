package main.java.br.com.locamax.api.produto.musica;

public class CD extends Musica{
    public boolean arranhado, duplo;

    public CD(String cod, String tit, String gen, String aut, int num, boolean dup, boolean arr) {
        super(cod, tit, gen, aut, num);
        this.duplo = dup;
        this.arranhado = arr;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
}
