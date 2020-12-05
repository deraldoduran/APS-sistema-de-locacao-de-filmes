package atv02;

public abstract class Produto {

    public String codigo;
    public String titulo;
    public String genero;
    public boolean locado;
    
    public Produto(String c, String t, String g, boolean l){
        this.codigo = c;
        this.titulo = t;
        this.genero = g;
        this.locado = l;
    }
    
    abstract public double calcularDiaria();
    
}
