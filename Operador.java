import java.util.ArrayList;

import atv02.Produto;

public class Operador extends Funcionario {
    private ArrayList <Cliente> cliente;
        
    private ArrayList <Produto> produtoQualquer;

    Gerente ge =new Gerente();

    public Operador (){
        super(n, m, l, s);
        this.cliente = new ArrayList<>();
        this.produtoQualquer = new ArrayList<>();
    }

    public String toString(){
        return this.nome + ":" + this.matricula + ":" + this.login + ":" + this.senha;
    }

    public void fazerLocacao(Produto c, Produto t, Produto g, Produto l, String n, int m ){
        ge.procurarClientePorMatricula(m);
        ge.procurarProdutoPorCodigo(c);
    }
}