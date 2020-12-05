package atv02;

public abstract class Musica extends Produto{
    
    public String autor;
    public int numFaixas;
    
    public Musica(String c, String t, String g, boolean l, String au, int num) {
        super(c, t, g, l);
        this.autor = au;
        this.numFaixas = num;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
    
}
