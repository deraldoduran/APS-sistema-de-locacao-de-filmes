package main.java.br.com.locamax.api.produto.filme;

public class VHS extends Filmes{
    public boolean cores;

    public VHS(String c, String t, String g, boolean l, int ano, int du, boolean cor) {
        super(c, t, g, l, ano, du);
        this.cores = cor;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }

}
