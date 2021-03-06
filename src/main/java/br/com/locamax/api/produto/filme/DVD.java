package main.java.br.com.locamax.api.produto.filme;

public class DVD extends Filmes {
    public boolean arranhado;

    public DVD(String cod, String tit, String gen, int ano, int dur, boolean arr, float valD) {
        super(cod, tit, gen, ano, dur, valD);
        this.arranhado = arr;
    }

    public String toString(){
        return
            "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n" +
            "aranhado: " + this.arranhado + "\n" +
            "locado: " + this.locado + "\n" +
            "valor ao dia: " + this.valDiaria + "\n";
    } 
}
