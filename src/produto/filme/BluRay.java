package produto.filme;

public class BluRay extends Filmes {
    public String idiomas;
    
    public BluRay(String c, String t, String g, boolean l, int ano, int du, String idi) {
        super(c, t, g, l, ano, du);
        this.idiomas = idi;
    }

    @Override
    public double calcularDiaria() {
        return 0; 
    }
}
