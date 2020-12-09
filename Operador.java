import java.util.ArrayList;
import java.util.Date;



public class Operador extends Funcionario {
    private ArrayList <Cliente> cliente;
        
    private ArrayList <Produto> produtoQualquer;

    private ArrayList <Locacao> lo;
    

    public Operador (String n, int m, String l, int s){
        super(n, m, l, s);
        this.cliente = new ArrayList<>();
        this.produtoQualquer = new ArrayList<>();
        this.lo = new ArrayList<>();
    }

    public String toString(){
        return this.nome + ":" + this.matricula + ":" + this.login + ":" + this.senha;
    }

    public void Locar(String c, String t, String g, boolean l, Date ds, Date ep, Date dd){
        lo.add(new Locacao(c, t, g, l, ds, ep, dd));
    }

}