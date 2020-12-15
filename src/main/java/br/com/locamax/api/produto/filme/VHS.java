package main.java.br.com.locamax.api.produto.filme;

public class VHS extends Filmes{
    public boolean cores;

    public VHS(String cod, String tit, String gen, int ano, int dur, boolean cor) {
        super(cod, tit, gen, ano, dur);
        this.cores = cor;
    }

    public String toString(){
        return
            "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n" +
            "em cores: " + this.cores + "\n" +
            "locado: " + this.locado + "\n";
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }

}
