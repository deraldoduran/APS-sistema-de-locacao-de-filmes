package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.produto.filme.*;
import main.java.br.com.locamax.api.produto.musica.*;
import main.java.br.com.locamax.api.repositorio.RepoProduct;

public class Gerente extends Funcionario {
    RepoProduct rProduct;

    public Gerente(String n, int m, String l, String s, RepoProduct rPro){
        super(n , m, l, s);
        this.rProduct = rPro;
    }

    public void addBluRay(String cod, String tit, String gen, int ano, int dur, String idi, Boolean arr, float valD){
        BluRay b = new BluRay(cod, tit, gen, ano, dur, idi, arr, valD);
        rProduct.addProduct(b);
    }

    public void addDVD(String cod, String tit, String gen, int ano, int dur, boolean arr, float valD){
        DVD d = new DVD(cod, tit, gen, ano, dur, arr, valD);
        rProduct.addProduct(d);
    }

    public void addVHS(String cod, String tit, String gen, int ano, int dur, boolean cor , float valD){
        VHS v = new VHS(cod, tit, gen, ano, dur, cor, valD);
        rProduct.addProduct(v);
    }

    public void addCD(String cod, String tit, String gen, String aut, int numF, Boolean dup, Boolean arr, float valD){
        CD c = new CD(cod, tit, gen, aut, numF, dup, arr, valD);
        rProduct.addProduct(c);
    }

    public void addLP(String cod, String tit, String gen, String aut, int numF, Boolean rar, float valD){
        LP l = new LP(cod, tit, gen, aut, numF, rar, valD);
        rProduct.addProduct(l);
    }
    
    /* public void addOperador(String n, int m, String l, String s){
        this.sis.operador.add(new Operador(n,m,l,s));
    }

    public void addCliente(String n, int m, String en, int id, char se ){
        this.sis.cliente.add(new Cliente(n, m, en, id, se));
    }

    public void listClientes(){
        for(int i=0; i<cliente.size(); i++)
            System.out.println(cliente.toString());
    }

    public void listProdutos(){
        for(int i=0; i<produtoQualquer.size(); i++)
            System.out.println(produtoQualquer.toString());
    }

    public void listOperador(){
        for(int i=0; i<operador.size(); i++)
            System.out.println(operador.toString());
    }

    public void listClientePorMatricula (int m){
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
    } */
}