

public class LP extends Musica{
    
    public boolean raro;
    
    public LP(String c, String t, String g, boolean l, String au, int num, boolean raro) {
        super(c, t, g, l, au, num);
        this.raro = raro;
    }

    @Override
    public double calcularDiaria() {
        return 0;
    }
    
}
