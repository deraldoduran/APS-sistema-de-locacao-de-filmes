package main.java.br.com.locamax.api.produto.musica;

public class LP extends Musica {
    public boolean raro;
    
    public LP(String cod, String tit, String gen, String aut, int numF, boolean raro, float valD){
        super(cod, tit, gen, aut, numF, valD);
        this.raro = raro;
    }

    public String toString(){
        return
            "código: " + this.codigo + "\n" +
            "título: " + this.titulo + "\n" +
            "genero: " + this.genero + "\n" +
            "autor(es): " + this.autor + "\n" +
            "número de faixas: " + this.numFaixas + "\n" +
            "raro: " + this.raro + "\n" +
            "locado: " + this.locado + "\n" +
            "valor ao dia: " + this.valDiaria + "\n";
    }

    @Override
    public double calcularDiaria(){
        return 0;
    }
}
