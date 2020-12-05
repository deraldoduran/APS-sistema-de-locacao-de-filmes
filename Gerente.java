import java.util.ArrayList;

import atv02.Produto;

public class Gerente extends Funcionario{

        private ArrayList <Cliente> cliente;
        
        private ArrayList <Produto> produtoQualquer;
        
        private ArrayList <Operador> operador;


    public Gerente(){
        super(n, m, l, s);
    }

    public void adicionaCliente(String n, int m, String en, int id, char se ){
        
        this.cliente =new Cliente(n, m, en, id, se);
    }

    public void adicionarProdutoQualquer(String c, String t, String g, boolean l){
        this.produtoQualquer = new Produto(c,t,g,l);
        
    }

    public void adicionarOperador(String n, int m, String l, int s){
        this.operador = new Operador(n,m,l,s);
    }
}