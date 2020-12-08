import java.util.ArrayList;

public class Operador extends Funcionario {
    private ArrayList <Cliente> cliente;
        
    private ArrayList <Produto> produtoQualquer;

    public Operador (){
        super(n, m, l, s);
        this.cliente = new ArrayList<>();
        this.produtoQualquer = new ArrayList<>();
    }

    public String toString(){
        return this.nome + ":" + this.matricula + ":" + this.login + ":" + this.senha;
    }

    public void fazerLocacao(){
        
    }
}