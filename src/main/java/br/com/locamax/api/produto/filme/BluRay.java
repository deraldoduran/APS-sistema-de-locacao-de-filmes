package main.java.br.com.locamax.api.produto.filme;

public class BluRay extends Filmes {
    public String idiomas;
    public boolean arranhado;
    
    public BluRay(String cod, String tit, String gen, int ano, int dur, String idi, boolean arr, float valD){
        super(cod, tit, gen, ano, dur, valD);
        this.arranhado = arr;
        this.idiomas = idi;
    }

    public String toString(){
        return
            "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n" +
            "idiomas: " + this.idiomas + "\n" +
            "aranhado: " + this.arranhado + "\n" +
            "locado: " + this.locado + "\n" +
            "valor ao dia: " + this.valDiaria + "\n";
    }
}
