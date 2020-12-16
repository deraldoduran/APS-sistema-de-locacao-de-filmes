package main.java.br.com.locamax.api.produto.filme;
import main.java.br.com.locamax.api.produto.Produto;

public abstract class Filmes extends Produto {
    public int anoLancamento;
    public int duracao;
    
    public Filmes(String cod, String tit, String gen, int ano, int dur, float valD){
        super(cod, tit, gen, valD);
        this.anoLancamento = ano;
        this.duracao = dur;
    }

    public String toString(){
        return
            "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "locado: " + this.locado + "\n" +
            "ano lancamento: " + this.anoLancamento + "\n" +
            "duracao (min): " + this.duracao + "\n" +
            "valor ao dia: " + this.valDiaria + "\n";
    }
}
