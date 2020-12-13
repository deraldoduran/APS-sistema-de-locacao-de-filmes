package main.java.br.com.locamax.api.produto.musica;

public class LP extends Musica{
    public boolean raro;
    
    public LP(String c, String t, String g, String au, int num, boolean raro) {
        super(c, t, g, au, num);
        this.raro = raro;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
}
