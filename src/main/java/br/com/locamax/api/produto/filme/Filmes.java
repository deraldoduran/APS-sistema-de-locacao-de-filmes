package main.java.br.com.locamax.api.produto.filme;
import main.java.br.com.locamax.api.produto.Produto;

public abstract class Filmes extends Produto{
    
    public int anoLancamento;
    public int duracao;
    
    public Filmes(String c, String t, String g, boolean l, int ano, int du) {
        super(c, t, g, l);
        this.anoLancamento = ano;
        this.duracao = du;
    }

    
    
}
