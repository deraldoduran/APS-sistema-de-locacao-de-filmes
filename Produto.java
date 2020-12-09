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

    public Produto(){
        
    }
    
    abstract public double calcularDiaria();

    public String toString(){
        return this.codigo + ":" + this.titulo + ":" + this.genero + ":" + this.locado;
    }
    
}
