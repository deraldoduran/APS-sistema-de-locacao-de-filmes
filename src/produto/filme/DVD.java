package produto.filme;

public class DVD extends Filmes{
    public boolean arranhado;

    public DVD(String c, String t, String g, boolean l, int ano, int du, boolean arr) {
        super(c, t, g, l, ano, du);
        this.arranhado = arr;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
}
