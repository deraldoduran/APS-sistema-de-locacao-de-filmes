package main.java.br.com.locamax.api.produto;

public abstract class Produto {
    public String codigo;
    public String titulo;
    public String genero;
    public float valDiaria;
    public boolean locado;

    public Produto(String cod, String tit, String gen, float valD){
        this.codigo = cod;
        this.titulo = tit;
        this.genero = gen;
        this.valDiaria = valD;
        this.locado = false;
    }

    // public abstract double calcularDiaria();

    public String toString(){
        return "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "locado: " + this.locado + "\n";
    }

    public String getCodigo(){
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public double getValDiaria(){
        return valDiaria;
    }

    public Boolean getLocado(){
        return locado;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setLocado(boolean locado){
        this.locado = locado;
    }
}
