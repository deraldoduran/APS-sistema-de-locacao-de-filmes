package produto.musica;

public class CD extends Musica{
    public boolean arranhado, duplo;

    public CD(String c, String t, String g, boolean l, String au, int num, boolean arr, boolean dp) {
        super(c, t, g, l, au, num);
        this.arranhado = arr;
        this.duplo = dp;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
}
