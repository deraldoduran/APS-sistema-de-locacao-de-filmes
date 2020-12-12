package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.pessoa.cliente.Cliente;
import main.java.br.com.locamax.api.locacao.Locacao;

import java.util.ArrayList;

public class Gerente extends Funcionario{
        private ArrayList <Cliente> cliente;
        private ArrayList <Locacao> produtoQualquer;
        private ArrayList <Operador> operador;

    public Gerente(String n, int m, String l, String s){
        super(n , m, l, s);
        this.cliente = new ArrayList<>();
        this.produtoQualquer = new ArrayList<>();
        this.operador = new ArrayList<>();
    }

    public void adicionaCliente(String n, int m, String en, int id, char se ){
        //this.cliente = new ArrayList<>();
        this.cliente.add(new Cliente(n, m, en, id, se));
    }

    public void adicionarProdutoQualquer(String c, String t, String g, boolean l){
/*         Produto p = new Produto(c, t, g, l);
        this.produtoQualquer.add(p); */
    }

    public void adicionarOperador(String n, int m, String l, String s){
        //this.operador = new ArrayList<>();
        this.operador.add(new Operador(n,m,l,s));
    }

    public void listarClientes(){
        for(int i=0; i<cliente.size(); i++){
            System.out.println(cliente.toString());
        }
    }

    public void listarProdutos(){
        for(int i=0; i<produtoQualquer.size(); i++){
            System.out.println(produtoQualquer.toString());
        }
    }

    public void listarOperador(){
        for(int i=0; i<operador.size(); i++){
            System.out.println(operador.toString());
        }
    }

    public void procurarClientePorMatricula (int m){
        for(int i = 0; i< cliente.size(); i++){
            if(cliente.get(i).matricula == m){
                //cliente.get(i).
                System.out.println(cliente.get(i).nome);
            }
        }
    }

    public void procurarProdutoPorCodigo( String c){
        for(int i = 0; i< produtoQualquer.size(); i++){
            if(produtoQualquer.get(i).codigo.equals(c) ){
                System.out.println(produtoQualquer.get(i).titulo);
            }
        }
    }

    public void procurarOperadoresPorMatricula(int m){
        for(int i = 0; i< operador.size(); i++){
            if(operador.get(i).matricula == m){
                System.out.println(operador.get(i).nome);
            }
        }
    }
}