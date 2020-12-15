package main.java.br.com.locamax.api.produto.filme;

public class BluRay extends Filmes {
    public String idiomas;
    public Boolean arranhado;
    
    public BluRay(String cod, String tit, String gen, int ano, int dur, String idi, Boolean arr) {
        super(cod, tit, gen, ano, dur);
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
            "locado: " + this.locado + "\n";
    }

    @Override
    public double calcularDiaria() {
        return 0; 
    }
}
